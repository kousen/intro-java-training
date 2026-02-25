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
        // return firstName + " " + lastName;
        return "%s %s".formatted(firstName, lastName);
    }
    
    // TODO: Check if an email contains the @ symbol
    public static boolean isValidEmail(String email) {
        // Your code here
        return email != null && email.contains("@");
    }
    
    // TODO: Extract the domain from an email address
    // Example: "user@example.com" -> "example.com"
    public static String extractDomain(String email) {
        // Your code here
        // return email.substring(email.indexOf("@") + 1);
        return email.split("@")[1];
    }
    
    // TODO: Count the number of words in a sentence
    // Assume words are separated by spaces
    public static int countWords(String sentence) {
        // Your code here
        return sentence.split(" ").length;
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
        int wordCount = countWords("The quick brown fox jumps over the lazy dog");
        System.out.println("Result: " + wordCount);
        System.out.println("Expected: 9");
        System.out.println("Pass: " + (wordCount == 9));

        System.out.println("Testing SQL:");
        int count = countWords("""
                CREATE TABLE users (
                    id INT PRIMARY KEY,
                    name VARCHAR(100),
                    email VARCHAR(100)
                );
                INSERT INTO users (id, name, email) VALUES (1, 'Alice', 'alice@example.com');
                INSERT INTO users (id, name, email) VALUES (2, 'Bob', 'bob@example.com');
                INSERT INTO users (id, name, email) VALUES (3, 'Charlie', 'charlie@example.com');
                SELECT COUNT(*) FROM users;
                """);
        System.out.println("Result: " + count);
        System.out.println("Expected: 9");
        System.out.println("Pass: " + (count == 9));

        System.out.println(isValidEmail(null));
    }
}