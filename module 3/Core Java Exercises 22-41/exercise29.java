import java.util.*;
import java.util.stream.Collectors;

// Step 1: Define the record
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        // Step 2: Create instances of Person
        Person p1 = new Person("Alice", 22);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 25);
        Person p4 = new Person("Daisy", 16);

        // Print individual Person records
        System.out.println("All Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // Step 3: Store records in a list
        List<Person> people = List.of(p1, p2, p3, p4);

        // Step 4: Use Stream API to filter persons aged 18 or older
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}
