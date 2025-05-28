//Decompile a class file
public class Greeting {
    public String greeter(String name) {
        return "Hello, " + name + "!";
    }
}

compile it:
javac Greeting.java

Download the JAR file
Run it in terminal:
java -jar cfr-0.152.jar Greeting.class
