package OOPS.Inheritance.SingleInheritance;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 4, "Labrador");
        dog.makeSound(); // Bow bow bow...
        dog.bark(); // Dog is barking...
        dog.wagTail(); // Dog is wagging tail...
        dog.eat(); // Animal is eating...  // we can access Parent class methods using Child class object
        System.out.println("Name: " + dog.getName() + ", Legs: " + dog.getNoOfLegs() + ", Breed: " + dog.getBreed());
    }
}
