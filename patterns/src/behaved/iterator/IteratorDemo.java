package behaved.iterator;

import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Война и мир", "Лев Толстой"));
        library.addBook(new Book("Преступление и наказание", "Фёдор Достоевский"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));

        BookIterator iterator = library.createIterator();
        System.out.println("Книги в библиотеке:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("- " + book);
        }
    }
}
