package Syncronization;

public class Counter {
    
    private int count =0; // shared resouurce

  // Without synchronized occurd race-arround condition 
    // public void increament(){
    //     count++;
    // }

    //  With synchronized it will locks the methods if allready used in other threads
    public synchronized void increament(){
        count++;  
    }

 // If won't to use in whole method synchronized use block of synchronized
    // public void increament(){
    //     synchronized(this){
    //         count++;  
    //     }
    // }


    public int getCount(){
        return count;
    }

}


// By synchronizing the increment method, you ensure that only one thread can execute this method at a time, which prevents the race condition. With this change, the output will consistently be 2000.