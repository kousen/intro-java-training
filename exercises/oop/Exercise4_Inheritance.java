package exercises.oop;

import java.text.NumberFormat;
import java.util.Locale;

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
    
    static class Employee implements Payable {
        protected String name;
        protected double salary;

        
    
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public double calculateBonus() {
            return 0.05 * salary; // 5% bonus
        }

        @Override
        public double calculateTotalPay() {
            return salary + calculateBonus();
        }
    }
    
    // TODO: Create Manager class that extends Employee with:
    // - additional field: teamSize (int)
    // - Constructor that takes name, salary, and teamSize
    // - Override calculateBonus() to return 0.10 * salary (10% bonus)
    // - method getTeamSize()

    static class Manager extends Employee {
        private int teamSize;

        public Manager(String name, double salary, int teamSize) {
            super(name, salary);
            this.teamSize = teamSize;
        }

        public int getTeamSize() {
            return teamSize;
        }

        @Override
        public double calculateBonus() {
            return 0.10 * salary; // 10% bonus
        }
    }
    
    
    // TODO: Create Developer class that extends Employee with:
    // - additional field: programmingLanguage (String)
    // - Constructor that takes name, salary, and programmingLanguage
    // - Override calculateBonus() to return 0.07 * salary (7% bonus)
    // - method getProgrammingLanguage()

    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        @Override
        public double calculateBonus() {
            return 0.07 * salary; // 7% bonus
        }
    }
    
    
    // TODO: Create interface Payable with:
    // - method calculateTotalPay() that returns salary + bonus
    // Make all employee classes implement this interface

    static interface Payable {
        double calculateTotalPay();
    }
    
    
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        
        System.out.println("=== Testing Employee Hierarchy ===");
        
        // Uncomment when you implement the classes
        
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Jane Smith", 80000, 5);
        Developer dev = new Developer("Bob Johnson", 70000, "Java");
        
        System.out.println("Employee: " + emp.getName());
        System.out.println("Base Salary: " + nf.format(emp.getSalary()));
        System.out.println("Bonus: " + nf.format(emp.calculateBonus()));
        System.out.println("Total Pay: " + nf.format(emp.calculateTotalPay()));
        System.out.println();
        
        System.out.println("Manager: " + mgr.getName());
        System.out.println("Base Salary: " + nf.format(mgr.getSalary()));
        System.out.println("Team Size: " + mgr.getTeamSize());
        System.out.println("Bonus: " + nf.format(mgr.calculateBonus()));
        System.out.println();
        
        System.out.println("Developer: " + dev.getName());
        System.out.println("Base Salary: " + nf.format(dev.getSalary()));
        System.out.println("Language: " + dev.getProgrammingLanguage());
        System.out.println("Bonus: " + nf.format(dev.calculateBonus()));
        
        // Test polymorphism
        System.out.println("\n=== Polymorphism Test ===");
        Employee[] employees = {emp, mgr, dev};
        for (Employee e : employees) {
            System.out.println(e.getName() + " total pay: " + nf.format(e.calculateTotalPay())) ;
        }
        
    }
}