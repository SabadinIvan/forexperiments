package threadpoolexample;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Worker extends Thread {
    private final BlockingQueue<Runnable> taskQueue;
    private final Runnable poisonPill;

    public Worker(BlockingQueue<Runnable> taskQueue, String name, Runnable poisonPill) {
        super(name);
        this.taskQueue = taskQueue;
        this.poisonPill = poisonPill;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Runnable task = taskQueue.take();
                if (task == this.poisonPill) {
                    break;
                }
                try {
                    task.run();
                } catch (Exception e) {
                    System.out.println("Task error: " + e.getMessage());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
