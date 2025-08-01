package solutions.basics;

/**
 * Exercise 1: Writing Simple Functions - SOLUTION
 */
public class Exercise1_SimpleFunctions {
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
    
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