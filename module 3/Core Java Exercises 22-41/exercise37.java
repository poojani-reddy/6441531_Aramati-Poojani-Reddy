//Using javap to inspect bytecode
public class SimpleMathematics {
    public int addition(int a, int b) {
        return a + b;
    }
}

Compilation:
-javac SimpleMathematics.java
Inspect the bytecode with javap:
-javap -c SimpleMathematics

Output :
Compiled from "SimpleMathematics.java"
public class SimpleMathematics {
  public SimpleMathematics();
    Code:
       0: aload_0
       1: invokespecial #1 
       4: return

  public int addition(int, int);
    Code:
       0: iload_1       
       1: iload_2       
       2: iadd          
       3: ireturn      
}
