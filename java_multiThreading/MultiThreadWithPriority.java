 
// setPriority(int newPriority): Changes the priority of the thread. The priority is a value between Thread.MIN_PRIORITY(1), Thread.NORM_PRIORITY(5) and Thread.MAX_PRIORITY(10).
 
 
 public class MultiThreadWithPriority extends Thread{
  
    // to set Thread Name as per our According
    public MultiThreadWithPriority(String name){
        super(name);
    }

    public void run(){
        System.out.println("Current thread " + Thread.currentThread().getName());
         for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }
    public static void main(String[] args){
      System.out.println();
      MultiThreadWithPriority lowPriorityThread = new MultiThreadWithPriority("Low Priority Thread");
      MultiThreadWithPriority mediumPriorityThread = new MultiThreadWithPriority("Medium Priority Thread");
      MultiThreadWithPriority highPriorityThread = new MultiThreadWithPriority("High Priority Thread");
      lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
      mediumPriorityThread.setPriority(Thread.NORM_PRIORITY);
      highPriorityThread.setPriority(Thread.MAX_PRIORITY);
      lowPriorityThread.start();
      mediumPriorityThread.start();
      highPriorityThread.start();
      

    }
    
 }