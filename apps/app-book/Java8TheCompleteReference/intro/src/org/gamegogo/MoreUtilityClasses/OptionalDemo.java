package org.gamegogo.MoreUtilityClasses;

import java.util.Optional;

// Demonstrate several Optional<T> methods
public class OptionalDemo {
    public static void main(String args[]) {
        /*A container object which may or may not contain a non-null value.
        If a value is present, isPresent() will return true and get() will return the value.
Additional methods that depend on the presence or absence of a contained value are provided,
such as orElse() (return a default value if value not present) and ifPresent()
(execute a block of code if the value is present).
This is a value-based class; use of identity-sensitive operations
(including reference equality (==), identity hash code, or synchronization)
on instances of Optional may have unpredictable results and should be avoided.*/
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) {
            System.out.println("This won't be displayed");
        } else {
            System.out.println("noVal has no value");
        }

        if (hasVal.isPresent()) {
            System.out.println("The string in hasVal is: " + hasVal.get());
        }

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}
