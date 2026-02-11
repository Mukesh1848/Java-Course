package enumJava;

enum EnumDays {

  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,

}

public enum HttpStatus {
  OK(200), NOT_FOUND(404), INTERNAL_SERVER_ERROR(500);

  private final int code;

  HttpStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}