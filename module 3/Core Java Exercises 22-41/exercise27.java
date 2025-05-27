//Create a List of strings. 
//Use Collections.sort() with a lambda to sort the list. 
//Display the sorted list. 
import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Step 1: Create a List of Strings
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Anna");
        names.add("Mike");
        names.add("Bob");
        names.add("Charlie");

        // Step 2: Sort the list using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // Step 3: Display the sorted list
        System.out.println("Sorted list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
