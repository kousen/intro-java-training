package exercises.oop;

public class GradeBook {
    Student[] students;

    public GradeBook(Student[] students) {
        this.students = students;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (Student student : students) {
            sum += student.calculateAverage();
        }
        return sum / students.length;
    }

    public Student getTopStudent() {
        Student topStudent = students[0];
        for (Student student : students) {
            if (student.calculateAverage() > topStudent.calculateAverage()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public Student getBottomStudent() {
        Student bottomStudent = students[0];
        for (Student student : students) {
            if (student.calculateAverage() < bottomStudent.calculateAverage()) {
                bottomStudent = student;
            }
        }
        return bottomStudent;
    }

    // print the gradebook
    public void printGradeBook() {
        for (Student student : students) {
            System.out.println(student.name + ": " + student.calculateAverage());
        }
    }
}
