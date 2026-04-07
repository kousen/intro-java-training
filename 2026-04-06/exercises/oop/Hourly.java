package exercises.oop;

public class Hourly extends Employee {
    private double hourlyRate;
    private double hoursWorked = 40.0;

    public Hourly(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return hourlyRate * hoursWorked; // Pay based on hours worked
    }
    
}
