//Define methods named add that accept: 
//Two integers. 
//Two doubles. 
//Three integers. 
//Each method should return the sum of its parameters. 
//Call each method and display the results.
import java.util.*;
class MethodOverloading{
    public static void main(String[] args) {
        System.out.println("Addition of two integers: "+add(10,20));
        System.out.println("Addition of two doubles: "+add(10.5,20.5));
        System.out.println("Addition of three integers: "+add(10,20,30));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    
}