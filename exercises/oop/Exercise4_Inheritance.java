package exercises.oop;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Exercise 4: Working with Inheritance
 * <p>
 * Create an inheritance hierarchy for employees.
 */
public class Exercise4_Inheritance {

    interface Payable {
        double calculateTotalPay();
    }
    
    static class Employee implements Payable {
        protected final String name;
        protected final double salary;

        Employee(String name, double salary) {
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
            return 0.05 * salary;
        }

        @Override
        public final double calculateTotalPay() { // template method
            return salary + calculateBonus();
        }
    }
    
    
    static class Manager extends Employee {
        private final int teamSize;

        Manager(String name, double salary, int teamSize) {
            super(name, salary);
            this.teamSize = teamSize;
        }

        @Override
        public double calculateBonus() {
            return 0.10 * salary;
        }

        public int getTeamSize() {
            return teamSize;
        }
    }
    
    
    static class Developer extends Employee {
        private final String programmingLanguage;

        Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        public double calculateBonus() {
            return 0.07 * salary;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing Employee Hierarchy ===");
        
        // Uncomment when you implement the classes
        
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
        NumberFormat currencyFormat = 
                NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(currencyFormat.getClass().getName());
        for (Employee e : employees) {
            System.out.println(e.getName() + " total pay: " + 
                    currencyFormat.format(e.calculateTotalPay()));
        }
        
    }
}
