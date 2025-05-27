//Define attributes: make, model, year. 
//Implement a method displayDetails() to print car information. 
//Create objects of the Car class and call the method.
import java.util.*;
class ClassAndObjectCreation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the make: ");
        String make=sc.nextLine();
        System.out.print("Enter the model: ");
        String model=sc.nextLine();
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        Car car=new Car(make, model, year);
        car.displayDetails();
    }
}
class Car{
    String make, model;
    int year;
    Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}