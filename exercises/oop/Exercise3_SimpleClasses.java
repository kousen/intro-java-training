package exercises.oop;

/**
 * Exercise 3: Writing Simple Classes
 * <p>
 * Create the following classes with the specified functionality.
 */
public class Exercise3_SimpleClasses {
    
    // TODO: Create a BankAccount class with:
    // - A private balance field
    // - Constructor that sets initial balance
    // - getBalance() method
    // - deposit(amount) method - adds to balance if amount > 0
    // - withdraw(amount) method - subtracts from balance if sufficient funds
    
    
    // TODO: Create a Rectangle class with:
    // - width and height fields
    // - Constructor to set both
    // - calculateArea() method that returns width * height
    // - calculatePerimeter() method that returns 2 * (width + height)
    
    
    // TODO: Create a Student class with:
    // - name field
    // - array of grades (double[])
    // - Constructor to set both
    // - calculateAverage() method that returns average of all grades
    // - getHighestGrade() method that returns the highest grade
    
    
    public static void main(String[] args) {
        System.out.println("=== Testing BankAccount ===");
        // Uncomment when you implement BankAccount
        /*
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("After deposit: " + account.getBalance());
        account.withdraw(200);
        System.out.println("After withdrawal: " + account.getBalance());
        account.withdraw(2000); // Should fail
        System.out.println("After failed withdrawal: " + account.getBalance());
        */
        
        System.out.println("\n=== Testing Rectangle ===");
        // Uncomment when you implement Rectangle
        /*
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        */
        
        System.out.println("\n=== Testing Student ===");
        // Uncomment when you implement Student
        /*
        double[] grades = {85.5, 90.0, 78.5, 92.0, 88.0};
        Student student = new Student("Alice", grades);
        System.out.println("Student: " + student.name);
        System.out.println("Average grade: " + student.calculateAverage());
        System.out.println("Highest grade: " + student.getHighestGrade());
        */
    }
}