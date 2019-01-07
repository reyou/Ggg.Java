package org.gamegogo.ExploringJavaLang.Thread;

// Demonstrate thread groups.
class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Running run(): " + getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        /*Causes the current thread to wait until another thread invokes the notify()
                        method or the notifyAll() method for this object. In other words,
                        this method behaves exactly as if it simply performs the call wait(0).*/
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        /*Wakes up a single thread that is waiting on this object's monitor.
        If any threads are waiting on this object, one of them is chosen to be awakened.
        The choice is arbitrary and occurs at the discretion of the implementation.
        A thread waits on an object's monitor by calling one of the wait methods.
The awakened thread will not be able to proceed until the current thread relinquishes
the lock on this object. The awakened thread will compete in the usual manner with any
other threads that might be actively competing to synchronize on this object; for example,
the awakened thread enjoys no reliable privilege or disadvantage in being the next thread
to lock this object.
This method should only be called by a thread that is the owner of this object's monitor.
A thread becomes the owner of the object's monitor in one of three ways:
By executing a synchronized instance method of that object.
By executing the body of a synchronized statement that synchronizes on the object.
For objects of type Class, by executing a synchronized static method of that class.
Only one thread at a time can own an object's monitor.*/
        notify();
    }
}














