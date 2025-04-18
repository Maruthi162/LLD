package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithIteratorDesignPattern;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title; // Initialize the book with a title
    }

    public String getTitle() {
        return title; // Get the title of the book
    }
    public void setTitle(String title) {
        this.title = title; // Set the title of the book
    }
}
