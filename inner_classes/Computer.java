package inner_classes;

public class Computer {
    
    private String model;
    private String generation;
    private String oSName;

    Computer(String model, String generation, String oSName) {
        this.model = model;
        this.generation = generation;
        this.oSName = oSName;
    }


   static class OperatingSystem {

       private  String OSName;

        OperatingSystem(String oSName) {
            this.OSName = oSName;
        }

        public void displayOS() {
            System.out.println("Operating System: " + OSName);
        }
    }

    class USB {
        private String type;

        USB(String type) {
            this.type = type;
        }

        public void displayUSBType() {
            System.out.println("USB Type: " + type);
        }
    }
}
