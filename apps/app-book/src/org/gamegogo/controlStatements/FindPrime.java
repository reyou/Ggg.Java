package org.gamegogo.controlStatements;

// Test for primes.
class FindPrime {
    public static void main(String args[]) {
        int num;
        boolean isPrime;
        num = 131;
        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i <= num / i; i++) {
            System.out.println("i = " + i);
            System.out.println("num / i");
            System.out.println(num + " / " + i + " = " + num / i);

            System.out.println("\n");
            System.out.println("(num % i)");
            System.out.println((num + " % " + i) + " = " + num % i);

            System.out.println("=================================");
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
