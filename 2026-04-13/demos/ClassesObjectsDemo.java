package demos;

/**
 * Classes and Objects Demo
 * 
 * Demonstrates object-oriented concepts including:
 * - Classes and objects
 * - Constructors
 * - Methods
 * - Encapsulation
 * - References and null
 */
public class ClassesObjectsDemo {
    
    // Demo class: Person
    static class Person {
        // Fields (instance variables)
        private String name;
        private int age;
        private String email;
        
        // Default constructor
        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }
        
        // Parameterized constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Full constructor
        public Person(String name, int age, String email) {
            this(name, age);  // Call other constructor
            this.email = email;
        }
        
        // Getters
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public String getEmail() {
            return email;
        }
        
        // Setters with validation
        public void setAge(int age) {
            if (age >= 0 && age <= 150) {
                this.age = age;
            } else {
                System.out.println("Invalid age: " + age);
            }
        }
        
        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Invalid email: " + email);
            }
        }
        
        // Instance methods
        public void introduce() {
            System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
        }
        
        public boolean canVote() {
            return age >= 18;
        }
        
        // toString method for string representation
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
        }
    }
    
    // Demo class: Car
    static class Car {
        private String make;
        private String model;
        private int year;
        private boolean isRunning;
        
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.isRunning = false;
        }
        
        public void start() {
            if (!isRunning) {
                isRunning = true;
                System.out.println(year + " " + make + " " + model + " started.");
            } else {
                System.out.println("Car is already running!");
            }
        }
        
        public void stop() {
            if (isRunning) {
                isRunning = false;
                System.out.println(year + " " + make + " " + model + " stopped.");
            } else {
                System.out.println("Car is not running!");
            }
        }
        
        public void honk() {
            System.out.println("Beep beep!");
        }
        
        public String getInfo() {
            return year + " " + make + " " + model;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Creating Objects ===");
        
        // Using different constructors
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30, "bob@example.com");
        
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
        
        System.out.println("\n=== Using Methods ===");
        person2.introduce();
        System.out.println("Can " + person2.getName() + " vote? " + person2.canVote());
        
        // Using setters
        person1.setAge(20);
        person1.setEmail("test@example.com");
        System.out.println("Updated person1: " + person1);
        
        System.out.println("\n=== References and Objects ===");
        Person person4 = person2;  // Copy reference, not object
        System.out.println("person2 age: " + person2.getAge());
        System.out.println("person4 age: " + person4.getAge());
        
        person4.setAge(26);  // Changes affect both references
        System.out.println("After changing person4 age:");
        System.out.println("person2 age: " + person2.getAge());
        System.out.println("person4 age: " + person4.getAge());
        
        System.out.println("\n=== Working with null ===");
        Person person5 = null;
        
        // Safe null checking
        if (person5 != null) {
            person5.introduce();
        } else {
            System.out.println("person5 is null!");
        }
        
        // This would cause NullPointerException:
        // person5.introduce();  // Don't do this!
        
        System.out.println("\n=== Car Demo ===");
        Car myCar = new Car("Toyota", "Camry", 2022);
        
        System.out.println("My car: " + myCar.getInfo());
        myCar.start();
        myCar.honk();
        myCar.start();  // Try to start again
        myCar.stop();
        myCar.stop();   // Try to stop again
        
        System.out.println("\n=== Object Comparison ===");
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        Person p3 = p1;
        
        System.out.println("p1 == p2: " + (p1 == p2));  // false (different objects)
        System.out.println("p1 == p3: " + (p1 == p3));  // true (same reference)
        
        // To compare content, you would need to implement equals() method
        System.out.println("p1.toString().equals(p2.toString()): " + 
                         p1.toString().equals(p2.toString()));  // true
    }
}