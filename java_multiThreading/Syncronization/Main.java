package Syncronization;

public class Main {
    public static void main(String[] args){

        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter); // passing same object(resource) 
        MyThread t2 = new MyThread(counter); // // passing same object(resource)
         t1.start();
         t2.start();

         try {
            t1.join();
            t2.join();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("count " + counter.getCount()); // Expected: 2000, Actual will be random <= 2000
    }
}


// The output of the code is not 2000 because the increment method in the Counter class is not synchronized. This results in a race condition when both threads try to increment the count variable concurrently.

// Without synchronization, one thread might read the value of count before the other thread has finished writing its incremented value. This can lead to both threads reading the same value, incrementing it, and writing it back, effectively losing one of the increments.

// We can fix this by using synchronized keyword


// By synchronizing the increment method, you ensure that only one thread can execute this method at a time, which prevents the race condition. With this change, the output will consistently be 2000.