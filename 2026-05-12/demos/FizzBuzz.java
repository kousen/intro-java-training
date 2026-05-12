package demos;

import java.time.LocalDate;
import java.util.stream.IntStream;

/**
 * FizzBuzz - Classic Programming Exercise
 *
 * This will be done as a code-along exercise during the course.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("FizzBuzz from 1 to 100:");
        System.out.println();

        LocalDate today = LocalDate.now();
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::fizzBuzzValue)
                .forEach(System.out::println);

    }

    private static String fizzBuzzValue(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
