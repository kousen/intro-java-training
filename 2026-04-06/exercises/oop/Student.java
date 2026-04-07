package exercises.oop;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        // double sum = 0;
        // for (double grade : grades) {
        //     sum += grade;
        // }
        // return grades.length > 0 ? sum / grades.length : 0;
        
        DoubleStream stream = Arrays.stream(grades);
        return stream.average().orElse(0);
    }

    public double getHighestGrade() {
        // double highest = Double.NEGATIVE_INFINITY;
        // for (double grade : grades) {
        //     if (grade > highest) {
        //         highest = grade;
        //     }
        // }
        // return highest;

        return Arrays.stream(grades).max().orElse(0.0);
    }
}
