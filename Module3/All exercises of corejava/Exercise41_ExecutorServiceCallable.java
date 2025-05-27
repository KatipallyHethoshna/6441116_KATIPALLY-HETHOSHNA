import java.util.concurrent.*;

public class Exercise41_ExecutorServiceCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Task completed";

        Future<String> future = executor.submit(task);
        System.out.println(future.get());

        executor.shutdown();
    }
}
