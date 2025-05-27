//Use a for loop to iterate from 1 to 10. 
//Multiply the input number by the loop counter and display the result.
import java.util.*;
class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
