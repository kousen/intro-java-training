package demos;

/**
 * FizzBuzz - Classic Programming Exercise
 * 
 * This will be done as a code-along exercise during the course.
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        System.out.println("FizzBuzz from 1 to 100:");
        System.out.println();
        
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {  // Divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {  // Divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {  // Divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    // Alternative implementation using string concatenation
    public static void fizzBuzzAlternative() {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}