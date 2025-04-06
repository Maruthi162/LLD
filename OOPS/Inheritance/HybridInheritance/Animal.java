package OOPS.Inheritance.HybridInheritance;

public class Animal {
    private int legs;
    
    //constructor
    public Animal(int legs){
        this.legs = legs;
    }

    //setters and getters
    public int getNoOfLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public void makeSound(){
        System.out.println("Animal is making sound...");
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
}
