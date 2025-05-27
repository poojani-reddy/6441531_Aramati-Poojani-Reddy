//Prompt the user for a string. 
//Remove any non-alphanumeric characters and convert to lowercase. 
//Check if the string reads the same forwards and backwards. 
//Display the result. import java.util.*;
class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: "); 
        String str=sc.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reverse=new StringBuilder(str).reverse().toString(); 
        if(str.equals(reverse)){ 
            System.out.println(str+" is a palindrome."); 
        } 
        else{ 
            System.out.println(str+" is not a palindrome."); 
        }
           
    }
}