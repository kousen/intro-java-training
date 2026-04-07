package exercises.oop;

import java.util.List;

public class HR {
    public static void main(String[] args) {
        Hourly fred = new Hourly("Fred", 101, 15.0, 40.0);
        Salaried barney = new Salaried("Barney", 102, 52000.0);

        List<Employee> employees = List.of(fred, barney);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (ID: " + employee.getId() + ") earns $" + employee.computePay() + " this week.");
        }
    }
}
