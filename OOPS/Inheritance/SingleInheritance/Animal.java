package OOPS.Inheritance.SingleInheritance;
//parent class 

public class Animal {
    private String name;
    private int legs;

    //constructor
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    //setters and getters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNoOfLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }

    //functionalities
    public void makeSound(){
        System.out.println("Animal is making sound...");
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
}
