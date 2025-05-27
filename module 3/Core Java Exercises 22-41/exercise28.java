import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        // Step 1: Create a List of Integers
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Step 2: Use Stream API to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Step 3: Display the filtered even numbers
        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
    }
}
