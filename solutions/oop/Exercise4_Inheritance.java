package solutions.oop;

/**
 * Exercise 4: Working with Inheritance - SOLUTION
 */
public class Exercise4_Inheritance {
    
    interface Payable {
        double calculateTotalPay();
    }
    
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
            return 0.05 * salary;  // 5% bonus
        }
        
        @Override
        public double calculateTotalPay() {
            return salary + calculateBonus();
        }
    }
    
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
            return 0.10 * salary;  // 10% bonus
        }
    }
    
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
            return 0.07 * salary;  // 7% bonus
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing Employee Hierarchy ===");
        
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Jane Smith", 80000, 5);
        Developer dev = new Developer("Bob Johnson", 70000, "Java");
        
        System.out.println("Employee: " + emp.getName());
        System.out.println("Base Salary: $" + emp.getSalary());
        System.out.println("Bonus: $" + emp.calculateBonus());
        System.out.println("Total Pay: $" + emp.calculateTotalPay());
        System.out.println();
        
        System.out.println("Manager: " + mgr.getName());
        System.out.println("Base Salary: $" + mgr.getSalary());
        System.out.println("Team Size: " + mgr.getTeamSize());
        System.out.println("Bonus: $" + mgr.calculateBonus());
        System.out.println("Total Pay: $" + mgr.calculateTotalPay());
        System.out.println();
        
        System.out.println("Developer: " + dev.getName());
        System.out.println("Base Salary: $" + dev.getSalary());
        System.out.println("Language: " + dev.getProgrammingLanguage());
        System.out.println("Bonus: $" + dev.calculateBonus());
        System.out.println("Total Pay: $" + dev.calculateTotalPay());
        
        // Test polymorphism
        System.out.println("\n=== Polymorphism Test ===");
        Employee[] employees = {emp, mgr, dev};
        double totalPayroll = 0;
        for (Employee e : employees) {
            double total = e.calculateTotalPay();
            System.out.println(e.getName() + " total pay: $" + total);
            totalPayroll += total;
        }
        System.out.println("Total payroll: $" + totalPayroll);
    }
}