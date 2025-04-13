package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithoutFlyWeight;

public class Lion {
    //Intrinsic properties
    //these properties are common for all Animals
    private String name; //name of the lion
    private String color; //color of the lion
    private String habitat; //habitat of the lion
    private String food; //food of the lion

    //constructor to initialize the properties of the lion
    public Lion(String name, String color, String habitat, String food) {
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
    
    public void roar() { //method to roar
        System.out.println(name + " is roaring.");
    }
    
    public void hunt() { //method to hunt
        System.out.println(name + " is hunting.");
    }

    //getters & Setters
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
