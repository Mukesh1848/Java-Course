package array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        // Using Loop for copying
        // Using arraycopy() method
        // Using clone() method
        // Using Arrays.copyOf() method
        // Using Arrays.copyOfRange() method

        // 1. Using Loop for copying
        // Best For: Small-sized arrays when performance is not a major concern
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // 2. Using arraycopy() method
        // Best For: Performance-critical applications
        // System.arraycopy(sourceArray, sourcePosition, destinationArray,
        // destinationPosition, length);

        int[] originalArray1 = { 1, 2, 3, 4, 5 };
        int[] copiedArray1 = new int[originalArray.length];

        System.arraycopy(originalArray1, 0, copiedArray1, 0, originalArray1.length);

        // 3. Using clone() method
        // The clone() method is used to create a shallow copy of an array. It works
        // only for one-dimensional arrays.
        // Best For: Quick duplication of arrays when dealing with primitive types.
        // it only copies object references, not the actual objects.
        int[] originalArray2 = { 1, 2, 3, 4, 5 };
        int[] copiedArray2 = originalArray2.clone();
        System.out.println("Copied Array: " + copiedArray2);

        // 4. Using Arrays.copyOf() method
        // Best For: When you need to create a copy of an array with a different size
        // The Arrays.copyOf() method is a simple way to copy an array while also
        // allowing us to change its size
        // Best For: Copying an entire array or resizing an array during copying.
        int[] originalArray3 = { 1, 2, 3, 4, 5 };
        int[] copiedArray3 = Arrays.copyOf(originalArray3, originalArray3.length);
        System.out.println("Copied Array: " + copiedArray3);

        // 5. Using Arrays.copyOfRange() method
        // Best For: Copying a portion of an array
        // Syntax : Arrays.copyOfRange(sourceArray, fromIndex, toIndex);

        int[] originalArray4 = { 1, 2, 3, 4, 5 };
        int[] copiedArray4 = Arrays.copyOfRange(originalArray4, 0, 3);
        System.out.println("Copied Array: " + copiedArray4);

    }
}
