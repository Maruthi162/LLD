package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithIteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Container{
    private List<Book> books; // List of books in the library
    public Library() {
        this.books = new ArrayList<>(); // Initialize the library with a list of books
    }
    @Override
    public Iterator getIterator() {
        return new BookIterator(books); // Return a new BookIterator for the list of books
    }
    public void addBook(Book book) {
        books.add(book); // Add a new book to the library
    }
    public void removeBook(Book book) {
        books.remove(book); // Remove a book from the library
    }
    public List<Book> getBooks() {
        return books; // Get the list of books in the library
    }
}
