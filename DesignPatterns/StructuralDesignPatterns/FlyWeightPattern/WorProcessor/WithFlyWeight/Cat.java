package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithFlyWeight;

public class Cat extends Animal {
    //this is the concrete class for the cat. It extends the abstract class Animal and implements the display method.
    public Cat(String type, String color, int age) { //constructor to initialize the cat object
        super(type, color, age); //calling the constructor of the parent class
    }

    @Override
    public void display() { //method to display the cat details
        System.out.println("Cat [type=" + type + ", color=" + color + ", age=" + age + "]");
    }

    //additional methods specific to Cat
    public void meow() { //method to meow
        System.out.println(type + " is meowing.");
    }
    public void scratch() { //method to scratch
        System.out.println(type + " is scratching.");
    }
    public void purr() { //method to purr
        System.out.println(type + " is purring.");
    }
    
}
