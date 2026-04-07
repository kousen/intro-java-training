package exercises.oop;

// Records were added in Java 16
// Immutable data holders (can not be changed after creation)
// In records, the constructor goes BEFORE the body
// Autogenerates equals(), hashCode(), and toString() methods based on the fields
//    and "getter" methods width() and height()
public record Rectangle(double width, double height) {
    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
