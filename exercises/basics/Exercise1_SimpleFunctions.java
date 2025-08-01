package exercises.basics;

/**
 * Exercise 1: Writing Simple Functions
 * <p>
 * Complete the following methods and test them using the main method.
 * Run this file to see if your implementations are correct.
 */
public class Exercise1_SimpleFunctions {
    
    // TODO: Write a function that multiplies two integers
    public static int multiply(int a, int b) {
        // Your code here
        return 0;
    }
    
    // TODO: Write a function that returns true if a number is even
    public static boolean isEven(int number) {
        // Your code here
        return false;
    }
    
    // TODO: Write a function that converts Celsius to Fahrenheit
    // Formula: F = C * 9/5 + 32
    public static double celsiusToFahrenheit(double celsius) {
        // Your code here
        return 0.0;
    }
    
    // Test your methods here
    public static void main(String[] args) {
        System.out.println("Testing multiply method:");
        System.out.println("multiply(4, 5) = " + multiply(4, 5));
        System.out.println("Expected: 20");
        System.out.println("Pass: " + (multiply(4, 5) == 20));
        System.out.println();
        
        System.out.println("Testing isEven method:");
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("Expected: true");
        System.out.println("Pass: " + (isEven(4) == true));
        System.out.println("isEven(7) = " + isEven(7));
        System.out.println("Expected: false");
        System.out.println("Pass: " + (isEven(7) == false));
        System.out.println();
        
        System.out.println("Testing celsiusToFahrenheit method:");
        System.out.println("celsiusToFahrenheit(0) = " + celsiusToFahrenheit(0));
        System.out.println("Expected: 32.0");
        System.out.println("Pass: " + (celsiusToFahrenheit(0) == 32.0));
        System.out.println("celsiusToFahrenheit(100) = " + celsiusToFahrenheit(100));
        System.out.println("Expected: 212.0");
        System.out.println("Pass: " + (celsiusToFahrenheit(100) == 212.0));
    }
}