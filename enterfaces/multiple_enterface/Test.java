// Multiple Inheritance -> Java does not support multiple inheritance directly, but we can achieve it through interfaces.

// Example 
// SmartPhone implements Phone, Camera, MusicPlayer
// This means SmartPhone can have functionalities of Phone, Camera, and MusicPlayer.


package enterfaces.multiple_enterface;

public class Test {
    public static void main(String[] args) {
        

        SmartPhone mySmartPhone = new SmartPhone();
        
        // Testing Phone functionalities
        mySmartPhone.makeCall();
        mySmartPhone.receiveCall();
        
        // Testing Camera functionalities
        mySmartPhone.takePhote();
        mySmartPhone.recordVideo();
        
        // Testing MusicPlayer functionalities
        mySmartPhone.playMusic();
        mySmartPhone.stopMusic();
    }
}
