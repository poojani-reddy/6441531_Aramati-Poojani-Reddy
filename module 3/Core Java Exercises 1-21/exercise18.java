//Animal class should have a method makeSound(). 
//Dog class should override makeSound() to print "Bark". 
//Instantiate both classes and call their methods.
class Inheritance{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();
        Dog dog=new Dog();
        dog.makeSound();
           
    }
}
class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks.");
    }
}