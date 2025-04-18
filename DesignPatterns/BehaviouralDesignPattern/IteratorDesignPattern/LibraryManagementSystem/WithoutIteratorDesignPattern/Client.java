package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithoutIteratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("To Kill a Mockingbird"));

        for(int i=0;i<library.getBooks().size();i++){               // Using for loop to iterate through the books
            System.out.println(library.getBooks().get(i).getTitle());
        }
    }
}
//problems with this code is that we are using for loop to iterate through the books.
//Data type dependency: 
    //The client code is tightly coupled with the data structure used to store the books. 
//If we change the data structure (e.g., from ArrayList to LinkedList), we need to modify the client code as well. 

//Voilation of OCP:
//  This violates the Open/Closed Principle, which states that software entities should be open for extension but closed for modification.
// By using an iterator, we can decouple the client code from the underlying data structure, making it more flexible and maintainable.

//Code Duplication: for suppose we have multiple clients that need to iterate through the books,
// we would have to duplicate the iteration logic in each client. This leads to code duplication and makes it harder to maintain the codebase.
