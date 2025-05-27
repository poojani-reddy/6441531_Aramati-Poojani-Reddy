//Generate a random number between 1 and 100. 
//Prompt the user to guess the number. 
//Provide feedback if the guess is too high or too low. 
//Continue until the user guesses correctly.
import java.util.*;
class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(100)+1;
        int guess=0;
        while(guess!=num){
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            if(guess>num){
                System.out.println("Too high! Try again.");
            }
            else if(guess<num){
                System.out.println("Too low! Try again.");
            }
            else{
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }
    
}