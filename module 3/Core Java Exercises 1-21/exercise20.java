//Prompt the user for two integers. 
//Attempt to divide the first by the second. 
//Catch any ArithmeticException and display an appropriate message. 
import java.util.*;
public class TryCatchExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}