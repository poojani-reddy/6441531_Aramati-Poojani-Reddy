//Reflection in java
/*Person.java*/
public class Person {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
/*ReflectionDemo.java*/
import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName("Person");

            // Create an instance
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Get and print all declared methods
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                System.out.println("Parameter count: " + method.getParameterCount());

                // Print parameter types
                for (Class<?> paramType : method.getParameterTypes()) {
                    System.out.println(" - Parameter type: " + paramType.getName());
                }

                // Invoke method if it has no parameters or one String parameter
                if (method.getParameterCount() == 0) {
                    method.invoke(obj); // e.g., sayHello()
                } else if (method.getParameterCount() == 1 && method.getParameterTypes()[0] == String.class) {
                    method.invoke(obj, "Alice"); // e.g., greet("Alice")
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

Compile and Run:
javac Person.java ReflectionDemo.java
java ReflectionDemo

Output:
Method: sayHello
Parameter count: 0
Hello!

Method: greet
Parameter count: 1
 - Parameter type: java.lang.String
Hello, Alice
