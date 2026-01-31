// Thread Lifecycle 
// The lifecycle of a thread in Java consists of several states, which a thread can move through during its execution.

// States

// New: A thread is in this state when it is created but not yet started.
// Runnable: After the start method is called, the thread becomes runnable. It’s ready to run and is waiting for CPU time.
// Running: The thread is in this state when it is executing.

public class LifeCycle extends Thread {

    @Override
    public void run(){
        System.out.println("Thread Run method is running."); // RUNNING State
        try {
            Thread.sleep(2000); // pause the thread(th1) for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws InterruptedException {
        System.out.println();
        // Thread Lifecycle States:
        LifeCycle th1 = new LifeCycle();
        System.out.println("Thread State: " + th1.getState()); // NEW 
        th1.start(); // Start the thread
        System.out.println("Thread State: " + th1.getState()); // RUNNABLE
        Thread.sleep(100); // pause the main method for the 100ms to execute the Run method
        System.out.println("Thread State: " + th1.getState()); // TIMED_WAITING(because of Thread.sleep in run method)
        th1.join(); // Wait for Thread(th1) to finish
        System.out.println("Thread State: " + th1.getState()); // TERMINATED (This will call when thread(th1) is finish your work, Means this will call after 2 seconds).
    }
}
