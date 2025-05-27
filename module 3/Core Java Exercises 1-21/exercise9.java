//Prompt the user for marks out of 100. 
//Use if-else statements to assign grades: 
//90-100: A 
//80-89: B 
//70-79: C 
//60-69: D 
//Below 60: F 
//Display the assigned grade.
import java.util.*;
class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks out of 100: ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade: A");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("Grade: B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("Grade: C");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}