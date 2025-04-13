package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithFlyWeight;

public abstract class Animal {
    //this is the abstract class for the animal. It defines the properties and methods that any animal should have.
    protected String type; //type of the animal
    protected String color; //color of the animal
    protected int age; //age of the animal

    public Animal(String type, String color, int age) { //constructor to initialize the animal object
        this.type = type;
        this.color = color;
        this.age = age;
    }

    //common methods for all animals
    public void eat() { //method to eat
        System.out.println(type + " is eating.");
    }
    public void sleep() { //method to sleep
        System.out.println(type + " is sleeping.");
    }
    public void run() { //method to run
        System.out.println(type + " is running.");
    }

    public abstract void display(); //abstract method to display the animal details
}

//THis is abstract class which is used to create the animal object. It has the properties and methods that any animal should have. 
//It has an abstract method display() which is implemented in the concrete classes like Cat, Lion and Deer