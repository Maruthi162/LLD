package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern.LibraryManagementSystem.WithIteratorDesignPattern;

public interface Iterator {
    boolean hasNext(); // Check if there is a next element in the collection
   
    public Object next(); // Get the next element in the collection
}
