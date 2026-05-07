package behaved.iterator;

import java.util.List;

public interface BookCollection {
    BookIterator createIterator();
    List<Book> getBooks();
}
