package exercises.oop;

public class UseHR {
    public static void main(String[] args) {
        Employee[] employees = {
            new Salaried("John Doe", "Manager", 52000),
            new Hourly("Jane Smith", "Developer", 25, 40),
            new Salaried("Alice Johnson", "Designer", 48000),
            new Hourly("Bob Brown", "Tester", 20, 35)
        };

        HR hr = new HR(employees);
        hr.printPayroll();
        System.out.println("Total Payroll: $" + hr.getTotalPayroll());
    }
}
