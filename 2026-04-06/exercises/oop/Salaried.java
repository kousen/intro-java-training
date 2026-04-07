package exercises.oop;

public class Salaried extends Employee {
    private double annualSalary;

    public Salaried(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double computePay() {
        return annualSalary / 52; // Weekly pay
    }
    
}
