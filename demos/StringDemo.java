package demos;

/**
 * String Demo - Basic String operations
 * <p>
 * Demonstrates common String methods and operations
 */
public class StringDemo {
    
    public static void main(String[] args) {
        System.out.println("=== String Creation ===");
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        
        System.out.println("s1 == s3: " + (s1 == s3));  // true (string pool)
        System.out.println("s1 == s2: " + (s1 == s2));  // false (different objects)
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // true (same content)
        
        System.out.println("\n=== String Methods ===");
        String text = "  Java Programming  ";
        
        System.out.println("Original: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Starts with '  ': " + text.startsWith("  "));
        System.out.println("Ends with '  ': " + text.endsWith("  "));
        
        System.out.println("\n=== String Manipulation ===");
        String name = "Java";
        System.out.println("charAt(0): " + name.charAt(0));
        System.out.println("substring(1, 3): " + name.substring(1, 3));
        System.out.println("indexOf('a'): " + name.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + name.lastIndexOf('a'));
        System.out.println("replace('a', 'o'): " + name.replace('a', 'o'));
        
        System.out.println("\n=== String Splitting ===");
        String csv = "apple,banana,orange,grape";
        String[] fruits = csv.split(",");
        System.out.println("Split by comma:");
        for (String fruit : fruits) {
            System.out.println("  - " + fruit);
        }
        
        System.out.println("\n=== String Building ===");
        // Inefficient way (creates many temporary strings)
        String result1 = "";
        for (int i = 0; i < 5; i++) {
            result1 = result1 + i + " ";
        }
        System.out.println("Concatenation: " + result1);
        
        // Efficient way
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i).append(" ");
        }
        System.out.println("StringBuilder: " + sb.toString());
        
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d, GPA: %.2f", 
                                       "Alice", 20, 3.756);
        System.out.println(formatted);
    }
}