import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CashierSimulate {

    public static volatile int countBuyer = 200;
    private static int totalServed = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(new Cashier("Cashier_" + (i + 1))));
        }

        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("All buyers are served. Total served " + totalServed + " buyers.");
    }

    private static synchronized int nextBuyer() {
        return countBuyer--;
    }

    private static synchronized void incrementServed() {
        totalServed++;
    }

    static class Cashier implements Runnable {
        private final Random random = new Random();
        private final String name;

        Cashier(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            while (true) {
                int client = nextBuyer();
                if (client <= 0) break;
                System.out.println("The cashier '" + name + "' begun serving the buyer\nThere are " + countBuyer + " in the queue.");
                int randomNumber = random.nextInt(5) + 1;
                try {
                    Thread.sleep(randomNumber * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The cashier '" + name + "' finished serving the buyer; serice time: " + randomNumber + " minutes.");
                incrementServed();
            }
        }
    }
}
