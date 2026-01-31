package array;

public class ArrayInJava {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int[] numbers = { 10, 20, 30, 40, 50 }; // Array with 5 elements

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        // forEach loop
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // two dimentional array
        // Declaring and initializing a 3x3 matrix
        int[][] numbers1 = new int[3][3]; // Creates a 3x3 array

        // Declaring and initializing a 3x3 matrix
        int[][] numbers2 = new int[3][3]; // Creates a 3x3 array

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            // Loop through columns
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        int[][] jaggedArray = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// You are telling Java to create a new array object of type int and size 5.
// Since int is a primitive type, all elements in the array are automatically
// initialized to 0 (the default value for int).
// Internally:
// Memory is allocated for 5 ints.
// Values are: [0, 0, 0, 0, 0].

// When an array is declared using new, its elements are automatically
// initialized to:
// 0 for numeric types (int, double, float, etc.).
// false for boolean type.
// null for object types (String, Integer, etc.).

// A jagged array is a multidimensional array where each row can have a
// different number of columns.