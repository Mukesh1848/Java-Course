// Integeral Number : 
// byte(-128 to 127), 
// short(-32768 to 32767), 
// int(-2147483648 to 2147483647), 
// long(-9223372036854775808 to 9223372036854775807)

// Decimal Number : 
// float (approx 6-7 decimal digits), 
// double (approx 15-16 decimal digits)

// Character : 
// char (0 to 65535)

// Boolean : 
// boolean (true or false)

// narrowing conversion: When we are converting a larger data type to a smaller data type it is called narrowing conversion. Data loss is possible(float 1.54 to int 1).

// widening conversion: When we are converting a smaller data type to a larger data type it is called widening conversion. Data loss is not possible.

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello world");
        byte num1 = 10;
        System.out.println(num1);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        short num2 = 128;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        int num3 = 32768; // java by defualt integer number is integer.
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long num4 = 214744951;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        float num5 = 1000.1541545412541545f; // java by defualt decimal number is double that't why need to add "f" in
                                             // the
                                             // last of float value
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        double num6 = 1000.541515412154114111; // java by defualt decimal number is double.
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
    }
}
