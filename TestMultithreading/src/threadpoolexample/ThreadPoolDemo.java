package threadpoolexample;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        SimpleThreadPool pool = new SimpleThreadPool(3);

        try {
            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                pool.submit(() -> {
                    System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        pool.shutdown();
        System.out.println("All tasks completed.");
    }
}
