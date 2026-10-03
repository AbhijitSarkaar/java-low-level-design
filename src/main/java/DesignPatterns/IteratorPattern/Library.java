package DesignPatterns.IteratorPattern;

import java.util.List;

public class Library implements Aggregate {

    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
