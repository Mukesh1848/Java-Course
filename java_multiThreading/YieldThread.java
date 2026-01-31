// yield(): Thread.yield() is a static method that suggests the current thread temporarily pause its execution to allow other threads of the same or higher priority to execute. It’s important to note that yield() is just a hint to the thread scheduler, and the actual behavior may vary depending on the JVM and OS.


public class YieldThread extends Thread{
     
    public YieldThread(String name){
        super(name);
    }

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println( Thread.currentThread().getName() +  " is Running");
             Thread.yield(); // hint to pause current Thread execution and give chance to execute another Thread.
        }
    }
    public static void main(String[] args) {
         YieldThread th1 = new YieldThread("th1");
         YieldThread th2 = new YieldThread("th2");
            th1.start();
            th2.start();
    }
}
