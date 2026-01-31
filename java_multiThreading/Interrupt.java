// interrupt(): Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.

public class Interrupt extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("thread is running"); // This will not to print
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Interrauopt " + e); // call to catch error (sleep interrupted)
        }
    }
     
    public static void main(String[] args) throws InterruptedException{
        Interrupt th1 = new Interrupt();
        th1.start();
        th1.interrupt();
    }
}
