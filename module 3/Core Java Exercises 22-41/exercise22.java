//Prompt the user for a string. 
//Write the string to a file named output.txt. 
//Confirm that the data has been written. 
import java.util.*;
public class exercise22{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        FileWriter fw=new FileWriter("output.txt");
        fw.write(str);
        fw.close();
        System.out.println("Data has been written to output.txt.");
    }
}
