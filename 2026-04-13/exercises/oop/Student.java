package exercises.oop;

public class Student {
    String name;
    double[] grades;
    
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double getHighestGrade() {
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
