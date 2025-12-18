package exercises.oop;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.DoubleStream;

public class Student {
    public String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
    //    double sum = 0;
    //    for (double grade : grades) {
    //        sum += grade;
    //    }
    //    return grades.length > 0 ? sum / grades.length : 0;

        return DoubleStream.of(grades)
                .average()
                .orElse(0.0);
    }

    public double getHighestGrade() {
        return Arrays.stream(grades)
                .max()
                .orElse(0.0);
    }
}
