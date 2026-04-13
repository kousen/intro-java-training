package exercises.oop;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract double computePay();

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.computePay(), other.computePay());
    }
}
