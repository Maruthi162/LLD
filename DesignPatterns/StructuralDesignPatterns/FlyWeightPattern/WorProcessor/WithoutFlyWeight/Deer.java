package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithoutFlyWeight;

public class Deer {
    //Intrinsic properties
    //these properties are common for all Animals
    private String name; //name of the deer
    private String color; //color of the deer
    private String habitat; //habitat of the deer
    private String food; //food of the deer

    //constructor to initialize the properties of the deer
    public Deer(String name, String color, String habitat, String food) {
        this.name = name;
        this.color = color;
        this.habitat = habitat;
        this.food = food;
    }

    public void eat() { //method to eat
        System.out.println(name + " is eating " + food + ".");
    }
    public void sleep() { //method to sleep
        System.out.println(name + " is sleeping in " + habitat + ".");
    }
    public void run() { //method to run
        System.out.println(name + " is running.");
    }
    public void graze() { //method to graze
        System.out.println(name + " is grazing.");
    }

    //setters & getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
