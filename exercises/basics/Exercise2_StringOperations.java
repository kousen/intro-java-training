package exercises.basics;

/**
 * Exercise 2: Working with Strings
 * <p>
 * Complete the following string manipulation tasks.
 */
public class Exercise2_StringOperations {
    
    // TODO: Create a full name from first and last name with a space between
    public static String createFullName(String firstName, String lastName) {
        // Your code here
        return "";
    }
    
    // TODO: Check if an email contains the @ symbol
    public static boolean isValidEmail(String email) {
        // Your code here
        return false;
    }
    
    // TODO: Extract the domain from an email address
    // Example: "user@example.com" -> "example.com"
    public static String extractDomain(String email) {
        // Your code here
        return "";
    }
    
    // TODO: Count the number of words in a sentence
    // Assume words are separated by spaces
    public static int countWords(String sentence) {
        // Your code here
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Testing createFullName:");
        String fullName = createFullName("John", "Doe");
        System.out.println("Result: " + fullName);
        System.out.println("Expected: John Doe");
        System.out.println("Pass: " + fullName.equals("John Doe"));
        System.out.println();
        
        System.out.println("Testing isValidEmail:");
        System.out.println("isValidEmail('user@example.com') = " + isValidEmail("user@example.com"));
        System.out.println("Expected: true");
        System.out.println("isValidEmail('invalid.email') = " + isValidEmail("invalid.email"));
        System.out.println("Expected: false");
        System.out.println();
        
        System.out.println("Testing extractDomain:");
        String domain = extractDomain("user@example.com");
        System.out.println("Result: " + domain);
        System.out.println("Expected: example.com");
        System.out.println("Pass: " + domain.equals("example.com"));
        System.out.println();
        
        System.out.println("Testing countWords:");
        int wordCount = countWords("The quick brown fox jumps");
        System.out.println("Result: " + wordCount);
        System.out.println("Expected: 5");
        System.out.println("Pass: " + (wordCount == 5));
    }
}