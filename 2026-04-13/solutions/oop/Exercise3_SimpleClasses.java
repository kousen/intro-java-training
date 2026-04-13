package solutions.oop;

/**
 * Exercise 3: Writing Simple Classes - SOLUTION
 */
public class Exercise3_SimpleClasses {
    
    static class BankAccount {
        private double balance;
        
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            }
        }
        
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds for withdrawal of $" + amount);
            }
        }
    }
    
    static class Rectangle {
        private double width;
        private double height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        public double calculateArea() {
            return width * height;
        }
        
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
    
    static class Student {
        public String name;
        private double[] grades;
        
        public Student(String name, double[] grades) {
            this.name = name;
            this.grades = grades;
        }
        
        public double calculateAverage() {
            if (grades.length == 0) {
                return 0;
            }
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }
        
        public double getHighestGrade() {
            if (grades.length == 0) {
                return 0;
            }
            double highest = grades[0];
            for (double grade : grades) {
                if (grade > highest) {
                    highest = grade;
                }
            }
            return highest;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing BankAccount ===");
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: $" + account.getBalance());
        account.deposit(500);
        System.out.println("After deposit: $" + account.getBalance());
        account.withdraw(200);
        System.out.println("After withdrawal: $" + account.getBalance());
        account.withdraw(2000); // Should fail
        System.out.println("After failed withdrawal: $" + account.getBalance());
        
        System.out.println("\n=== Testing Rectangle ===");
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        
        System.out.println("\n=== Testing Student ===");
        double[] grades = {85.5, 90.0, 78.5, 92.0, 88.0};
        Student student = new Student("Alice", grades);
        System.out.println("Student: " + student.name);
        System.out.println("Average grade: " + student.calculateAverage());
        System.out.println("Highest grade: " + student.getHighestGrade());
    }
}