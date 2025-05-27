//Open output.txt for reading. 
//Read each line and display it on the console. 
import java.util.*;

public class FileReading {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String fileName=sc.nextLine();
            Scanner sc1=new Scanner(new File(fileName));
            while(sc1.hasNextLine()){
                System.out.println(sc1.nextLine());
            }
            sc1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
