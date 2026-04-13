package exercises.oop;

public class Salaried extends Employee {
    private double annualSalary;

    public Salaried(String name, String position, double annualSalary) {
        super(name, position);
        this.annualSalary = annualSalary;
    }

    @Override
    public double computePay() {
        return annualSalary / 52.0; // weekly pay based on annual salary
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

}
