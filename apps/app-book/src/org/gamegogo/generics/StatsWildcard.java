package org.gamegogo.generics;

// Use a wildcard.
public class StatsWildcard<T extends Number> {
    // array of Number or subclass
    T[] nums;

    // Pass the constructor a reference to
// an array of type Number or subclass.
    StatsWildcard(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    // Determine if two averages are the same.
// Notice the use of the wildcard.
    boolean sameAvg(StatsWildcard<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}