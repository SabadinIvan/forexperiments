package behaved.iterator;

import java.util.ArrayList;
import java.util.List;

public class NumberCollection {
    private final List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    // Прямой итератор
    public NumberIterator createForwardIterator() {
        return new ForwardIterator();
    }

    // Обратный итератор
    public NumberIterator createReverseIterator() {
        return new ReverseIterator();
    }

    // Чётный итератор
    public NumberIterator createEvenIterator() {
        return new EvenIterator();
    }

    private class ForwardIterator implements NumberIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < numbers.size();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return numbers.get(currentIndex++);
        }
    }

    private class ReverseIterator implements NumberIterator {
        private int currentIndex;

        public ReverseIterator() {
            this.currentIndex = numbers.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return numbers.get(currentIndex--);
        }
    }

    private class EvenIterator implements NumberIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            while (currentIndex < numbers.size()) {
                if (numbers.get(currentIndex) % 2 == 0) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int result = numbers.get(currentIndex);
            currentIndex++;
            return result;
        }
    }
}
