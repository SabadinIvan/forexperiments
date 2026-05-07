package behaved.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator createIterator() {
        return new LibraryIterator();
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

        private class LibraryIterator implements BookIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return books.get(currentIndex++);
        }
    }
}
