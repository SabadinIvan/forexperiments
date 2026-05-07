package behaved.iterator;

public class NumberIteratorDemo {

    public static void main(String[] args) {
        NumberCollection collection = new NumberCollection();

        for (int i = 1; i < 11; i++) {
            collection.addNumber(i);
        }

        System.out.println("=== Прямой обход ===");
        NumberIterator forward = collection.createForwardIterator();
        while (forward.hasNext()) {
            System.out.print(forward.next() + " ");
        }
        System.out.print("\n");
        System.out.println("===");

        System.out.println("=== Обратный обход ===");
        NumberIterator reverse = collection.createReverseIterator();
        while (reverse.hasNext()) {
            System.out.print(reverse.next() + " ");
        }
        System.out.print("\n");
        System.out.println("===");

        System.out.println("=== Только чётные числа ===");
        NumberIterator even = collection.createEvenIterator();
        while (even.hasNext()) {
            System.out.print(even.next() + " ");
        }
        System.out.print("\n");
        System.out.println("===");
    }
}
