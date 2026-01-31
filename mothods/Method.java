
public class Method {

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = { 45, 56, 23, 1, 2 };
        System.out.println(sumOfArray(arr));
    }
}