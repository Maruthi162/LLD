package OOPS.Inheritance.MultipleInheritance;

public class Bird {
    private String name;
    private int legs;
    private String color;

    //constructor
    public Bird(String name, int legs, String color){
        this.name = name;
        this.legs = legs;
        this.color = color;
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
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //functionalities
    public void eat(){
        System.out.println("Bird is eating...");
    }
    public void makeSound(){
        System.out.println("Bird is making sound...");
    }
}
