package exercises.oop;

public class Hourly extends Employee {
    private double hourlyRate;
    private double hoursWorked = 40.0; // Default to 40 hours per week

    public Hourly(String name, String position, double hourlyRate, double hoursWorked) {
        super(name, position);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return hourlyRate * hoursWorked; // weekly pay based on hours worked and hourly rate
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
