// Medium Article - https://medium.com/@pratik.941/comprehensive-guide-to-enums-in-java-58dab564580a

package enumJava;

public class Test {
    public static void main(String[] args) {

        // using enum
        System.out.println(EnumDays.SUNDAY);
        System.out.println(EnumDays.MONDAY);
        System.out.println(EnumDays.TUESDAY);
        System.out.println(EnumDays.SUNDAY);

        EnumDays today = EnumDays.MONDAY;

        if (today == EnumDays.MONDAY) {
            System.out.println("Start of the work week!");
        }

        // using interface
        System.out.println(EnumInterfaceDays.MONDAY);
        System.out.println(EnumInterfaceDays.TUESDAY);

    }
}
