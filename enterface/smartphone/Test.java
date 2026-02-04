package enterface.smartphone;

public class Test {

    public static void main(String[] args) {
        smartPhone phone = new smartPhone();
        phone.takePhoto();
        phone.recordVideo();
        phone.playMusic();
        phone.pauseMusic();
        phone.stopMusic();
        phone.call("1234567890");
        phone.sms("1234567890", "Hello");
        phone.broken();
    }
}
