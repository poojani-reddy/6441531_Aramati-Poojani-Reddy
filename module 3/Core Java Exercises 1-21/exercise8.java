//Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;. 
//Display the result and explain the order of operations.
import java.util.*;
class OperatorPrecedence{
    public static void main(String[] args) {
        int result = 10 + 5 * 2; 
        System.out.println(result);
    }
}
//Multiplication (*) has higher precedence than addition (+).
//So it first evaluates 5 * 2 → 10.
//Then it adds 10 + 10 → 20.