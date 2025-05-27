//Pattern Matching for switch
public class PatternMatchingSwitch {
    
    public static void checkType(Object obj) {
        // Enhanced switch expression with pattern matching
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer with value: " + i);
            case String s  -> System.out.println("It's a String with text: \"" + s + "\"");
            case Double d  -> System.out.println("It's a Double with value: " + d);
            case null      -> System.out.println("It's null.");
            default        -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        checkType(42);
        checkType("Hello Java 21");
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
}
