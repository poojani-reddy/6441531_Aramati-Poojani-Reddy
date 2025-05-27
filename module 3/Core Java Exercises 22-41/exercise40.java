//Virtual Threads
/*VirtualThreadsDemo.java*/
public class VirtualThreadsDemo {
    public static void main(String[] args) {
        int count = 100_000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from " + Thread.currentThread());
            });
        }
        long end = System.currentTimeMillis();
        System.out.println("Launched " + count + " virtual threads in " + (end - start) + " ms");
    }
}