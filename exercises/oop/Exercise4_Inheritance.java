package exercises.oop;

/**
 * Exercise 4: Working with Inheritance
 * <p>
 * Create an inheritance hierarchy for employees.
 */
public class Exercise4_Inheritance {
    
    // TODO: Create base class Employee with:
    // - protected fields: name (String), salary (double)
    // - Constructor to initialize both fields
    // - getters for both fields
    // - method calculateBonus() that returns 0.05 * salary (5% bonus)
    
    
    // TODO: Create Manager class that extends Employee with:
    // - additional field: teamSize (int)
    // - Constructor that takes name, salary, and teamSize
    // - Override calculateBonus() to return 0.10 * salary (10% bonus)
    // - method getTeamSize()
    
    
    // TODO: Create Developer class that extends Employee with:
    // - additional field: programmingLanguage (String)
    // - Constructor that takes name, salary, and programmingLanguage
    // - Override calculateBonus() to return 0.07 * salary (7% bonus)
    // - method getProgrammingLanguage()
    
    
    // TODO: Create interface Payable with:
    // - method calculateTotalPay() that returns salary + bonus
    // Make all employee classes implement this interface
    
    
    public static void main(String[] args) {
        System.out.println("=== Testing Employee Hierarchy ===");
        
        // Uncomment when you implement the classes
        /*
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Jane Smith", 80000, 5);
        Developer dev = new Developer("Bob Johnson", 70000, "Java");
        
        System.out.println("Employee: " + emp.getName());
        System.out.println("Base Salary: $" + emp.getSalary());
        System.out.println("Bonus: $" + emp.calculateBonus());
        System.out.println();
        
        System.out.println("Manager: " + mgr.getName());
        System.out.println("Base Salary: $" + mgr.getSalary());
        System.out.println("Team Size: " + mgr.getTeamSize());
        System.out.println("Bonus: $" + mgr.calculateBonus());
        System.out.println();
        
        System.out.println("Developer: " + dev.getName());
        System.out.println("Base Salary: $" + dev.getSalary());
        System.out.println("Language: " + dev.getProgrammingLanguage());
        System.out.println("Bonus: $" + dev.calculateBonus());
        
        // Test polymorphism
        System.out.println("\n=== Polymorphism Test ===");
        Employee[] employees = {emp, mgr, dev};
        for (Employee e : employees) {
            System.out.println(e.getName() + " total pay: $" + 
                             (e.getSalary() + e.calculateBonus()));
        }
        */
    }
}