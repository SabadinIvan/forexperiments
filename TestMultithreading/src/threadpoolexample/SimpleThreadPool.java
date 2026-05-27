package threadpoolexample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimpleThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final Worker[] workers;
    private volatile boolean isShutdown = false;
    private static final Runnable POISON_PILL = () -> {};

    public SimpleThreadPool(int poolSize) {
        taskQueue = new LinkedBlockingQueue<>();
        workers = new Worker[poolSize];

        for (int i = 0; i < poolSize; i++) {
            workers[i] = new Worker(taskQueue, "Worker-" + (i+1), POISON_PILL);
            workers[i].start();
        }
    }

    public void submit(Runnable task) throws InterruptedException {
        if (!isShutdown) {
            taskQueue.put(task);
        } else {
            throw new IllegalArgumentException("ThreadPool is shutdown");
        }
    }

    public void shutdown() {
        isShutdown = true;
        for (int i = 0; i < workers.length; i++) {
            try {
                System.out.println("POISON_PILL added");
                taskQueue.put(POISON_PILL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        for (Worker worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
