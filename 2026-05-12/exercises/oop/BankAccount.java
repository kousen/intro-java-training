package exercises.oop;

public class BankAccount {
    private double currentBalance   ;

    public BankAccount(double initialBalance) {
        this.currentBalance = initialBalance;
    }

    public double getBalance() {
        return currentBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && currentBalance >= amount) {
            currentBalance -= amount;
        }
    }
}
