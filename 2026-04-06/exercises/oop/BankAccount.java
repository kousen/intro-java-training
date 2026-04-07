package exercises.oop;

public class BankAccount implements Comparable<BankAccount> {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    @Override
    public int compareTo(BankAccount o) {
        return Double.compare(this.balance, o.balance);
    }

    public double getBalance() { // "getter" method for balance
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
    
}
