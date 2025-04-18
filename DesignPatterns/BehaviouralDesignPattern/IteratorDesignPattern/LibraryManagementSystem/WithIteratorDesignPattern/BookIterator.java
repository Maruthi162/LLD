package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithIteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> books; // List of books to iterate over
    private int index; // Current index in the iteration

    public BookIterator(List<Book> books) {
        this.books = books; // Initialize the iterator with a list of books
    }
    @Override
    public boolean hasNext() {
        return index < books.size(); // Check if there are more books to iterate over
    }
    @Override
    public Object next() {
        if (this.hasNext()) {
            return books.get(index++); // Return the current book and move to the next index
        }
        return null; // Return null if there are no more books to iterate over
    }
}
