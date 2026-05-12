package demos;

import java.util.Arrays;

/**
 * Array Demo - Working with arrays in Java
 */
public class ArrayDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Creating Arrays ===");
        
        // Different ways to create arrays
        int[] numbers1 = new int[5];  // Creates [0, 0, 0, 0, 0]
        int[] numbers2 = {10, 20, 30, 40, 50};  // Initialize with values
        int[] numbers3 = new int[]{5, 10, 15};  // Explicit initialization
        
        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
        
        System.out.println("\n=== Accessing Array Elements ===");
        System.out.println("First element: " + numbers2[0]);
        System.out.println("Last element: " + numbers2[numbers2.length - 1]);
        System.out.println("Array length: " + numbers2.length);
        
        // Modifying elements
        numbers2[2] = 35;
        System.out.println("After modification: " + Arrays.toString(numbers2));
        
        System.out.println("\n=== Iterating Through Arrays ===");
        
        // Traditional for loop
        System.out.print("Traditional loop: ");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        
        // Enhanced for loop (for-each)
        System.out.print("Enhanced loop: ");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\n=== Common Array Operations ===");
        int[] data = {3, 1, 4, 1, 5, 9, 2, 6};
        
        // Finding sum
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        System.out.println("Sum: " + sum);
        
        // Finding max
        int max = data[0];
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max: " + max);
        
        System.out.println("\n=== Array Utilities ===");
        System.out.println("Original: " + Arrays.toString(data));
        
        // Sorting
        int[] sorted = data.clone();  // Create a copy
        Arrays.sort(sorted);
        System.out.println("Sorted: " + Arrays.toString(sorted));
        
        // Searching (array must be sorted)
        int index = Arrays.binarySearch(sorted, 5);
        System.out.println("Index of 5 in sorted array: " + index);
        
        // Filling
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));
        
        // Comparing
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3));
        
        System.out.println("\n=== 2D Arrays ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("2D Array:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        // Enhanced for loop with 2D arrays
        System.out.println("\nUsing enhanced for loop:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}