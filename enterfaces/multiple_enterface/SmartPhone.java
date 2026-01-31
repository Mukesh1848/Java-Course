package enterfaces.multiple_enterface;

public class SmartPhone implements Phone, Camera, MusicPlayer {

       @Override
    public void makeCall() {
        System.out.println("Making a call from the smartphone.");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call on the smartphone.");
    }

    @Override
    public void takePhote() {
        System.out.println("Taking a photo with the smartphone camera.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video with the smartphone camera.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on the smartphone.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music on the smartphone.");
    }
    
}
