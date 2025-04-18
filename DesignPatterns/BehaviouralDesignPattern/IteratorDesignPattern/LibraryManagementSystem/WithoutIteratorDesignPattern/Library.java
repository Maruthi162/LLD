package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithoutIteratorDesignPattern;

import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}
