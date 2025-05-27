//Create an ArrayList to store names. 
//Allow the user to add names to the list. 
//Display all names entered. 
import java.util.*;

public class exercise24 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Enter a name: ");
            name = sc.nextLine();
            names.add(name);
        } while (!name.equals("stop"));
        System.out.println(names);
    }
}