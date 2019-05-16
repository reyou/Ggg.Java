package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.SemDemoPackage;
// A simple semaphore example.
import java.util.concurrent.*;

public class SemDemo {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

