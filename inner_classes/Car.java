package inner_classes;

public class Car {
    
    private String model;
    private boolean isEngineOn;

    //constructor to initialize the car model and engine state
    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }


    // Inner class to manage the engine state (Member inner(non-static) class)
    class engine {

        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println("Engine started for " + model);
            } else {
                System.out.println("Engine is already on for " + model);
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println("Engine stopped for " + model);
            } else {
                System.out.println("Engine is already off for " + model);
            }
        }
    }
}
