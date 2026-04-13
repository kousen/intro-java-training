package exercises.oop;

public class UseGradebook {
    public static void main(String[] args) {
        Student alice = new Student("Alice", new double[] {85, 90, 78});
        Student bob = new Student("Bob", new double[] {92, 88, 95});
        Student charlie = new Student("Charlie", new double[] {70, 75, 80});
        
        Student[] students = {alice, bob, charlie};
        GradeBook gradebook = new GradeBook(students);
        System.out.println("Average grade: " + gradebook.getAverageGrade());
        System.out.println("Top student: " + gradebook.getTopStudent().name);
        System.out.println("Bottom student: " + gradebook.getBottomStudent().name);
        System.out.println("Gradebook:");
        gradebook.printGradeBook();
    }
}
