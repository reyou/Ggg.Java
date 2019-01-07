package org.gamegogo.generics;

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
public class StatsNumber<T extends Number> {
    // array of Number or subclass
    T[] nums;

    // Pass the constructor a reference to
// an array of type Number or subclass.
    StatsNumber(T[] o) {
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
}
