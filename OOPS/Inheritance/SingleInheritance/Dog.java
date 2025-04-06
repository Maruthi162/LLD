package OOPS.Inheritance.SingleInheritance;
//Dog is extending the behaviour of Animal class. hence Dog is child of Animal class
//this is exmple of Single Inheritance 
//Dog is a Animal
public class Dog extends Animal{
    private String breed;

    //constructor
    public Dog(String name, int legs, String bred){
        super(name, legs);
        this.breed = bred;
    }

    //setters and getters
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }   

    //functionalities
    public void bark(){
        System.out.println("Dog is barking...");
    }
    @Override
    public void makeSound(){                          // Overriding the makeSound method of Animal class
        System.out.println(" Bow bow bow...");
    }
    public void wagTail(){
        System.out.println("Dog is wagging tail...");
    }
}
