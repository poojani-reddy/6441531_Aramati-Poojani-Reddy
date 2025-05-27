//Decompile a class file
public class Greeter {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

compile it:
javac Greeter.java

Download the JAR file
Run it in terminal:
java -jar cfr-0.152.jar Greeter.class