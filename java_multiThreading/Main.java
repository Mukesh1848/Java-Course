// Java MultiThreading Article By Medium -> https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6


// A thread is a lightweight process, the smallest unit of processing. Java supports multithreading through its java.lang.Thread class and the java.lang.Runnable interface.

// When a Java program starts, one thread begins running immediately, which is called the main thread. This thread is responsible for executing the main method of a program.

// how to create a multithreaded program in Java

// Method 1: extend the Thread class

// A new class is created that extends Thread.
// The run method is overridden to define the code that constitutes the new thread.
// start method is called to initiate the new thread.


// Method 2: Implement Runnable interface

// A new class is created that implements Runnable.
// The run method is overridden to define the code that constitutes the new thread.
// A Thread object is created by passing an instance of a class(thread class).
// start method is called on the Thread object to initiate the new thread.


public class Main {
    
    public static void main(String[] args) {
      
        // Methid 1: extend the Thread class
        NewThread thread1 = new NewThread(); 
        thread1.start(); // Start the new thread1

        // Method 2: implement the Runnable interface
        NewThread1 thread2 = new NewThread1();
        Thread t2 = new Thread(thread2); // Create a thread using the Runnable implementation
        t2.start(); // Start the new thread2


        System.out.println();
        System.out.println("Hello, World!");
        for(; ; ) {
                System.out.println("Thread " + Thread.currentThread().getName() + " is running: " );
            }
    }
}
