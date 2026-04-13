package exercises.collections;

import java.util.*;

/**
 * Exercise 5: Working with Collections
 * 
 * Complete the following collection-based tasks.
 */
public class Exercise5_Collections {
    
    // TODO: Create a phone book using HashMap
    // - Add at least 5 contacts
    // - Look up a contact by name
    // - Print all contacts
    public static void phoneBookDemo() {
        // Your code here
    }
    
    // TODO: Remove duplicates from a list
    // - Take a List<String> with duplicates
    // - Return a List<String> without duplicates
    // - Maintain the original order if possible
    public static List<String> removeDuplicates(List<String> input) {
        // Your code here
        return new ArrayList<>();
    }
    
    // TODO: Count word frequency in a sentence
    // - Split the sentence into words
    // - Count how many times each word appears
    // - Return a Map<String, Integer> with word counts
    public static Map<String, Integer> countWords(String sentence) {
        // Your code here
        return new HashMap<>();
    }
    
    // TODO: Implement a simple shopping cart
    // - Use appropriate collection(s)
    // - Support: addItem(item, quantity), removeItem(item), 
    //   getQuantity(item), getTotalItems(), getItems()
    static class ShoppingCart {
        // Your code here
        
        public void addItem(String item, int quantity) {
            // Your code here
        }
        
        public void removeItem(String item) {
            // Your code here
        }
        
        public int getQuantity(String item) {
            // Your code here
            return 0;
        }
        
        public int getTotalItems() {
            // Your code here
            return 0;
        }
        
        public Set<String> getItems() {
            // Your code here
            return new HashSet<>();
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
    }
}