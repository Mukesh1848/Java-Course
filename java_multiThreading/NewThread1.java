public class NewThread1 implements Runnable { // This class implements Runnable interface

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Thread using Runabble " + Thread.currentThread().getName() + " is running: ");
        }
    } 
}
