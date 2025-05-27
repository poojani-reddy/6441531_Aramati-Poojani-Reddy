//Executor Service and Callable
import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int num = i;
            Callable<Integer> task = () -> {
                Thread.sleep(500); // Simulate work
                return num * num;
            };
            Future<Integer> future = executor.submit(task);
            futures.add(future);
        }
        for (Future<Integer> future : futures) {
            try {
                System.out.println("Result: " + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}

Output:
Result: 1
Result: 4
Result: 9
Result: 16
...
Result: 100