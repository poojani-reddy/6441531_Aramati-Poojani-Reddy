//Throw InvalidAgeException if the user's age is less than 18. 
//Catch the exception and display a message.
import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            }
            System.out.println("You are eligible to vote.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}