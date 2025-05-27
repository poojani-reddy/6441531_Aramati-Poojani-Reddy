//Define a class that extends Thread or implements Runnable. 
//In the run() method, print a message multiple times. 
//Start both threads and observe the output.
import java.util.*;

public class ThreadCreation extends Thread implements Runnable{
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Thread "+i);
        }
    }
    public static void main(String[] args) {
        ThreadCreation t1=new ThreadCreation();
        ThreadCreation t2=new ThreadCreation();
        t1.start();
        t2.start();
    
    }

}
