package org.gamegogo.multithreadedProgramming.correctProducerConsumer;

// A correct implementation of a producer and consumer.
class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
            /*Causes the current thread to wait until another thread invokes
            the notify() method or the notifyAll() method for this object.
            In other words, this method behaves exactly as if it simply performs
            the call wait(0).
            The current thread must own this object's monitor. The thread releases
            ownership of this monitor and waits until another thread notifies
            threads waiting on this object's monitor to wake up either through
            a call to the notify method or the notifyAll method. The thread then
            waits until it can re-obtain ownership of the monitor and resumes execution.*/
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        valueSet = false;
        /*Wakes up a single thread that is waiting on this object's monitor.
        If any threads are waiting on this object, one of them is chosen to be
        awakened. The choice is arbitrary and occurs at the discretion of the
        implementation. A thread waits on an object's monitor by calling one of
        the wait methods.
The awakened thread will not be able to proceed until the current thread relinquishes
the lock on this object. The awakened thread will compete in the usual manner with
any other threads that might be actively competing to synchronize on this object;
for example, the awakened thread enjoys no reliable privilege or disadvantage in
being the next thread to lock this object.
This method should only be called by a thread that is the owner of this object's monitor.
A thread becomes the owner of the object's monitor in one of three ways:
1) By executing a synchronized instance method of that object.
2) By executing the body of a synchronized statement that synchronizes on the object.
3) For objects of type Class, by executing a synchronized static method of that class.
Only one thread at a time can own an object's monitor.*/
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

