package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithoutFlyWeight;

public class Horse {
    //Intrinsic properties
    //these properties are common for all Animals
    private String name; //name of the horse
    private String color; //color of the horse
    private String habitat; //habitat of the horse
    private String food; //food of the horse

    //constructor to initialize the properties of the horse
    public Horse(String name, String color, String habitat, String food) {
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
    public void gallop() { //method to gallop
        System.out.println(name + " is galloping.");
    }
    public void run() { //method to run
        System.out.println(name + " is running.");
    }
    public void trot() { //method to trot
        System.out.println(name + " is trotting.");
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
