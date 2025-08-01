package demos;

import java.util.*;

/**
 * Collections Demo
 * 
 * Demonstrates the Java Collections Framework:
 * - Lists (ArrayList, LinkedList)
 * - Sets (HashSet, TreeSet)
 * - Maps (HashMap, TreeMap)
 * - Common operations and patterns
 */
public class CollectionsDemo {
    
    public static void main(String[] args) {
        System.out.println("=== ArrayList Demo ===");
        arrayListDemo();
        
        System.out.println("\n=== LinkedList Demo ===");
        linkedListDemo();
        
        System.out.println("\n=== HashSet Demo ===");
        hashSetDemo();
        
        System.out.println("\n=== TreeSet Demo ===");
        treeSetDemo();
        
        System.out.println("\n=== HashMap Demo ===");
        hashMapDemo();
        
        System.out.println("\n=== TreeMap Demo ===");
        treeMapDemo();
        
        System.out.println("\n=== Collections Utility Demo ===");
        collectionsUtilityDemo();
    }
    
    static void arrayListDemo() {
        // Creating and adding elements
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");  // Insert at index 1
        
        System.out.println("Fruits: " + fruits);
        
        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));
        
        // Modifying elements
        fruits.set(2, "Grape");
        System.out.println("After modification: " + fruits);
        
        // Removing elements
        fruits.remove("Mango");
        fruits.remove(0);
        System.out.println("After removal: " + fruits);
        
        // Iteration
        System.out.print("Using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Contains check
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
    }
    
    static void linkedListDemo() {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        // Adding elements
        numbers.add(10);
        numbers.addFirst(5);
        numbers.addLast(15);
        numbers.add(1, 7);
        
        System.out.println("Numbers: " + numbers);
        
        // LinkedList specific operations
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());
        
        // Remove first and last
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);
        
        // Using as a queue
        numbers.offer(20);  // Add to end
        Integer polled = numbers.poll();  // Remove from beginning
        System.out.println("Polled: " + polled);
        System.out.println("After queue operations: " + numbers);
    }
    
    static void hashSetDemo() {
        Set<String> colors = new HashSet<>();
        
        // Adding elements (no duplicates allowed)
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");  // Duplicate - ignored
        
        System.out.println("Colors: " + colors);
        System.out.println("Size: " + colors.size());
        
        // Checking membership
        System.out.println("Contains 'Blue': " + colors.contains("Blue"));
        System.out.println("Contains 'Yellow': " + colors.contains("Yellow"));
        
        // Removing elements
        colors.remove("Green");
        System.out.println("After removal: " + colors);
        
        // Set operations
        Set<String> moreColors = new HashSet<>(Arrays.asList("Yellow", "Red", "Purple"));
        
        // Union
        Set<String> union = new HashSet<>(colors);
        union.addAll(moreColors);
        System.out.println("Union: " + union);
        
        // Intersection
        Set<String> intersection = new HashSet<>(colors);
        intersection.retainAll(moreColors);
        System.out.println("Intersection: " + intersection);
    }
    
    static void treeSetDemo() {
        // TreeSet maintains sorted order
        TreeSet<Integer> scores = new TreeSet<>();
        scores.addAll(Arrays.asList(85, 92, 78, 95, 88, 90));
        
        System.out.println("Sorted scores: " + scores);
        
        // TreeSet specific operations
        System.out.println("First (lowest): " + scores.first());
        System.out.println("Last (highest): " + scores.last());
        System.out.println("Scores >= 90: " + scores.tailSet(90));
        System.out.println("Scores < 90: " + scores.headSet(90));
        System.out.println("Scores between 85-92: " + scores.subSet(85, 93));
    }
    
    static void hashMapDemo() {
        Map<String, Integer> inventory = new HashMap<>();
        
        // Adding key-value pairs
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);
        
        System.out.println("Inventory: " + inventory);
        
        // Accessing values
        System.out.println("Apples in stock: " + inventory.get("Apples"));
        System.out.println("Grapes in stock: " + inventory.get("Grapes"));  // null
        
        // Safe access with default
        int grapes = inventory.getOrDefault("Grapes", 0);
        System.out.println("Grapes (with default): " + grapes);
        
        // Updating values
        inventory.put("Bananas", 35);  // Update existing
        inventory.putIfAbsent("Grapes", 25);  // Add if not present
        System.out.println("Updated inventory: " + inventory);
        
        // Iterating through map
        System.out.println("\nInventory details:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
        
        // Keys and values
        System.out.println("All fruits: " + inventory.keySet());
        System.out.println("All quantities: " + inventory.values());
        
        // Remove
        inventory.remove("Oranges");
        System.out.println("After removing oranges: " + inventory);
    }
    
    static void treeMapDemo() {
        // TreeMap maintains keys in sorted order
        TreeMap<String, Double> grades = new TreeMap<>();
        grades.put("Charlie", 85.5);
        grades.put("Alice", 92.0);
        grades.put("Bob", 88.5);
        grades.put("David", 78.0);
        
        System.out.println("Grades (sorted by name): " + grades);
        
        // NavigableMap operations
        System.out.println("First entry: " + grades.firstEntry());
        System.out.println("Last entry: " + grades.lastEntry());
        System.out.println("Entry before Charlie: " + grades.lowerEntry("Charlie"));
        System.out.println("Entry after Bob: " + grades.higherEntry("Bob"));
    }
    
    static void collectionsUtilityDemo() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        
        System.out.println("Original: " + numbers);
        
        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        
        // Reverse
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        
        // Shuffle
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        
        // Min and Max
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));
        
        // Frequency
        System.out.println("Frequency of 1: " + Collections.frequency(numbers, 1));
        
        // Binary search (list must be sorted)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Index of 5 in sorted list: " + index);
        
        // Creating immutable collections
        List<String> immutableList = Collections.unmodifiableList(
            Arrays.asList("One", "Two", "Three")
        );
        System.out.println("Immutable list: " + immutableList);
        // immutableList.add("Four");  // Would throw UnsupportedOperationException
    }
}