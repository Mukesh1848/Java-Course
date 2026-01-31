 // Method 1: extend the Thread class
 
 public class NewThread extends Thread {   //this is a class that extends the Thread class
   
        // @Override
        public void run() {
            for(; ; ) {
                System.out.println("Thread " + Thread.currentThread().getName() + " is running: " );
            }
        }
    
}


