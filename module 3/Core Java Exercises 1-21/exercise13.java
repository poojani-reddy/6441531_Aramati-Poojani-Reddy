//Recursive Fibonacci
import java.util.*;
class RecursiveFibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result=fibonacci(num);
        System.out.println(result);    
    
    }
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}