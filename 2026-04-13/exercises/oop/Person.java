package exercises.oop;

import java.time.LocalDate;

public class Person {
    // Fields (state)
    private String name;
    private LocalDate birthDate;

    // Constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    // Method (behavior)
    public void introduce() {
        System.out.println("Hi, I'm " + name + 
                         " and I'm " + getAge() + " years old.");
    }
}