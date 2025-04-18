package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithIteratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java")); // Add a book to the library
        library.addBook(new Book("Python")); // Add another book to the library
        library.addBook(new Book("C++")); // Add another book to the library
        
        Iterator iterator = library.getIterator(); // Get an iterator for the library
        while (iterator.hasNext()) { // Iterate through the books in the library
            Book book = (Book) iterator.next(); // Get the next book
            System.out.println("Book: " + book.getTitle()); // Print the title of the book
        }
    }
}
//Here we have implemented Iterator Design Pattern in Library Management System.
//The Library class implements the Container interface and provides an iterator for its collection of books.