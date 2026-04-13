package exercises.oop;

import java.text.NumberFormat;
import java.util.Arrays;

public class HR {

    private Employee[] employees;

    public HR(Employee[] employees) {
        this.employees = employees;
    }

    public void printPayroll() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        employees = sortEmployeesByPay(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (" + employee.getPosition() + "): " +           currencyFormat.format(employee.computePay()));
        }
    }

    private Employee[] sortEmployeesByPay(Employee[] employees) {
        Arrays.sort(employees);
        return employees;
    }

    public double getTotalPayroll() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.computePay();
        }
        return total;
    }

}
