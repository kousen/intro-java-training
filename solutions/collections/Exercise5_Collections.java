package solutions.collections;

import java.util.*;

/**
 * Exercise 5: Working with Collections - SOLUTION
 */
public class Exercise5_Collections {
    
    public static void phoneBookDemo() {
        Map<String, String> phoneBook = new HashMap<>();
        
        // Add contacts
        phoneBook.put("Alice Johnson", "555-1234");
        phoneBook.put("Bob Smith", "555-2345");
        phoneBook.put("Charlie Brown", "555-3456");
        phoneBook.put("Diana Prince", "555-4567");
        phoneBook.put("Edward Norton", "555-5678");
        
        // Look up a contact
        String searchName = "Bob Smith";
        String phoneNumber = phoneBook.get(searchName);
        System.out.println(searchName + ": " + phoneNumber);
        
        // Print all contacts
        System.out.println("\nAll contacts:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static List<String> removeDuplicates(List<String> input) {
        // Using LinkedHashSet to maintain order and remove duplicates
        Set<String> uniqueSet = new LinkedHashSet<>(input);
        return new ArrayList<>(uniqueSet);
    }
    
    public static Map<String, Integer> countWords(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Split by whitespace
        String[] words = sentence.toLowerCase().split("\\s+");
        
        for (String word : words) {
            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        return wordCount;
    }
    
    static class ShoppingCart {
        private Map<String, Integer> items;
        
        public ShoppingCart() {
            this.items = new HashMap<>();
        }
        
        public void addItem(String item, int quantity) {
            if (quantity > 0) {
                items.put(item, items.getOrDefault(item, 0) + quantity);
            }
        }
        
        public void removeItem(String item) {
            items.remove(item);
        }
        
        public int getQuantity(String item) {
            return items.getOrDefault(item, 0);
        }
        
        public int getTotalItems() {
            int total = 0;
            for (int quantity : items.values()) {
                total += quantity;
            }
            return total;
        }
        
        public Set<String> getItems() {
            return new HashSet<>(items.keySet());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Phone Book Demo ===");
        phoneBookDemo();
        
        System.out.println("\n=== Remove Duplicates ===");
        List<String> withDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        System.out.println("Original: " + withDuplicates);
        System.out.println("Without duplicates: " + removeDuplicates(withDuplicates));
        
        System.out.println("\n=== Word Frequency ===");
        String sentence = "the quick brown fox jumps over the lazy dog the fox";
        Map<String, Integer> wordCounts = countWords(sentence);
        System.out.println("Word counts: " + wordCounts);
        
        System.out.println("\n=== Shopping Cart ===");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apples", 5);
        cart.addItem("Bananas", 3);
        cart.addItem("Apples", 2); // Should increase quantity
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Total items: " + cart.getTotalItems());
        System.out.println("Apples quantity: " + cart.getQuantity("Apples"));
        cart.removeItem("Bananas");
        System.out.println("After removing bananas: " + cart.getItems());
        System.out.println("Total items after removal: " + cart.getTotalItems());
    }
}