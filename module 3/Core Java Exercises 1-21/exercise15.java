//String Reversal
import java.util.*;
class StringReversal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Reversed string: "+new StringBuilder(str).reverse());
    }
}