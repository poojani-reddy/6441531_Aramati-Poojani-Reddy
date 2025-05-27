//Implement the interface in classes Guitar and Piano. 
//Each class should provide its own implementation of play(). 
//Instantiate the classes and call the method.
// Define the interface
interface Instrument {
    void play(); 
}

class Guitar implements Instrument {
    public void play() {
        System.out.println("Strumming the guitar...");
    }
}


class Piano implements Instrument {
    public void play() {
        System.out.println("Playing the piano...");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();
        myGuitar.play(); 
        myPiano.play();   
    }
}


