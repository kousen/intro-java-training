package solutions.basics;

/**
 * Exercise 2: Working with Strings - SOLUTION
 */
public class Exercise2_StringOperations {
    
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
    
    public static String extractDomain(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex != -1 && atIndex < email.length() - 1) {
            return email.substring(atIndex + 1);
        }
        return "";
    }
    
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
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