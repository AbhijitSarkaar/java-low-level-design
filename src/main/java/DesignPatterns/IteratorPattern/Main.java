package DesignPatterns.IteratorPattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("book1"),
                new Book("book2"),
                new Book("book3")
        );

        Library library = new Library(books);
        Iterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
