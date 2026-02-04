package enterface.smartphone;

public interface Phone {

    public abstract void call(String number);

    public abstract void sms(String number, String message);

    public abstract void broken();
}
