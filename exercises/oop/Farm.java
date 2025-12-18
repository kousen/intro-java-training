package exercises.oop;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Bird());
        animals.add(new Horse());
        // animals.add(new Animal());
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
