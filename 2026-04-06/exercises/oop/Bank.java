package exercises.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(1500);
        BankAccount account3 = new BankAccount(500);

        List<BankAccount> accounts = new ArrayList<>(
            List.of(account1, account2, account3)) ;
        Collections.sort(accounts);

        System.out.println("Sorted accounts:");
        for (BankAccount account : accounts) {
            System.out.println("Balance: " + account.getBalance());
        }
    }
}
