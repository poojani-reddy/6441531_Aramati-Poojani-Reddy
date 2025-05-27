//Create a HashMap with Integer keys and String values. 
//Allow the user to add entries. 
//Retrieve and display a name based on an entered ID. 
import java.util.*;

public class exercise25 {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String name = "";
        do {
            System.out.println("Enter an ID: ");
            id = sc.nextInt();
            System.out.println("Enter a name: ");
            name = sc.next();
            names.put(id,name);
        } while (!name.equals("stop"));
        System.out.println(names);
    }
}