package exercises.oop;

import java.time.LocalDate;
import java.time.Month;

public class UsePerson {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 
            LocalDate.of(1990, Month.MAY, 15));
        Person bob = new Person("Bob", 
            LocalDate.of(1995, Month.AUGUST, 20));
        
        alice.introduce();
        bob.introduce();
    }
}
