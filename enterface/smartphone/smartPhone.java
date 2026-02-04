package enterface.smartphone;

public class smartPhone implements Phone, Camera, Music {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " with message: " + message);
    }

    @Override
    public void broken() {
        System.out.println("smart Phone is broken");
    }
}
