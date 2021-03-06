package org.gamegogo.TheCollectionsFramework;

import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorExample {
    public static void main(String args[]) {
        Double[] data = {1.0, 2.0, 3.1, 4.6};
        Object[] tags = {"tag1", "tag2", "tag3", "tag4"};
        TaggedArray<Double> taggedArray = new TaggedArray<>(data, tags);
        Spliterator<Double> spliterator = taggedArray.spliterator();
        while(spliterator.tryAdvance((n) -> System.out.println(n)));
    }
}

class TaggedArray<T> {
    private final Object[] elements; // immutable after construction

    TaggedArray(T[] data, Object[] tags) {
        int size = data.length;
        if (tags.length != size) {
            throw new IllegalArgumentException();
        }
        this.elements = new Object[2 * size];
        for (int i = 0, j = 0; i < size; ++i) {
            elements[j++] = data[i];
            elements[j++] = tags[i];
        }
    }

    /*An object for traversing and partitioning elements of a source.
    The source of elements covered by a Spliterator could be, for example,
    an array, a Collection, an IO channel, or a generator function.*/
    public Spliterator<T> spliterator() {
        return new TaggedArraySpliterator<>(elements, 0, elements.length);
    }

    static class TaggedArraySpliterator<T> implements Spliterator<T> {
        private final Object[] array;
        private int origin; // current index, advanced on split or traversal
        private final int fence; // one past the greatest index

        TaggedArraySpliterator(Object[] array, int origin, int fence) {
            this.array = array;
            this.origin = origin;
            this.fence = fence;
        }

        public void forEachRemaining(Consumer<? super T> action) {
            for (; origin < fence; origin += 2)
                action.accept((T) array[origin]);
        }

        public boolean tryAdvance(Consumer<? super T> action) {
            if (origin < fence) {
                action.accept((T) array[origin]);
                origin += 2;
                return true;
            } else // cannot advance
                return false;
        }

        public Spliterator<T> trySplit() {
            int lo = origin; // divide range in half
            int mid = ((lo + fence) >>> 1) & ~1; // force midpoint to be even
            if (lo < mid) { // split out left half
                origin = mid; // reset this Spliterator's origin
                return new TaggedArraySpliterator<>(array, lo, mid);
            } else       // too small to split
                return null;
        }

        public long estimateSize() {
            return (long) ((fence - origin) / 2);
        }

        public int characteristics() {
            return ORDERED | SIZED | IMMUTABLE | SUBSIZED;
        }
    }
}