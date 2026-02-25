package exercises.oop;

/**
 * Exercise 3: Writing Simple Classes
 * <p>
 * Create the following classes with the specified functionality.
 */
public class Exercise3_SimpleClasses {
    
    // TODO: Create a BankAccount class with:
    // - A private accountBalance field
    // - Constructor that sets initial accountBalance
    // - getAccountBalance() method
    // - deposit(amount) method - adds to accountBalance if amount > 0
    // - withdraw(amount) method - subtracts from accountBalance if sufficient funds

    static class BankAccount {
        private double accountBalance;

        public BankAccount(double initialBalance) {
            this.accountBalance = initialBalance;
        }

        public double getAccountBalance() {
            return accountBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                accountBalance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= accountBalance) {
                accountBalance -= amount;
            }
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            long temp;
            temp = Double.doubleToLongBits(accountBalance);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            BankAccount other = (BankAccount) obj;
            if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "BankAccount [balance=" + accountBalance + "]";
        }

        
    }
    
    
    // TODO: Create a Rectangle class with:
    // - width and height fields
    // - Constructor to set both
    // - calculateArea() method that returns width * height
    // - calculatePerimeter() method that returns 2 * (width + height)

    // records are immutable data carriers, but we can still add methods to them
    // The constructor appears before the body
    // auto-generates equals(), hashCode(), and toString() methods based on the fields
    // "getters" match the field names (e.g., width() and height()) instead of getWidth() and getHeight()
    record Rectangle(double width, double height) {
        public double calculateArea() {
            return width * height;
        }

        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
    
    
    // TODO: Create a Student class with:
    // - name field
    // - array of grades (double[])
    // - Constructor to set both
    // - calculateAverage() method that returns average of all grades
    // - getHighestGrade() method that returns the highest grade

    static class Student {
        String name;
        double[] grades;

        public Student(String name, double[] grades) {
            this.name = name;
            this.grades = grades;
        }

        public double calculateAverage() {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }

        public double getHighestGrade() {
            double highest = Double.MIN_VALUE;
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
        // Uncomment when you implement BankAccount
        
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: " + account.getAccountBalance());
        account.deposit(500);
        System.out.println("After deposit: " + account.getAccountBalance());
        account.withdraw(200);
        System.out.println("After withdrawal: " + account.getAccountBalance());
        account.withdraw(2000); // Should fail
        System.out.println("After failed withdrawal: " + account.getAccountBalance());
        
        
        System.out.println("\n=== Testing Rectangle ===");
        // Uncomment when you implement Rectangle
        
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println(rect);
        
        
        System.out.println("\n=== Testing Student ===");
        // Uncomment when you implement Student
        
        double[] grades = {88.0, 89.0, 90.0, 91.0, 92.0};
        Student student = new Student("Alice", grades);
        System.out.println("Student: " + student.name);
        System.out.println("Average grade: " + student.calculateAverage());
        System.out.println("Highest grade: " + student.getHighestGrade());
        
    }
}