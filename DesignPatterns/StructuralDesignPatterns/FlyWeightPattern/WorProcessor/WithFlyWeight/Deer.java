package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithFlyWeight;

public class Deer extends Animal {
    //this is the concrete class for the deer. It extends the abstract class Animal and implements the display method.
    public Deer(String type, String color, int age) { //constructor to initialize the deer object
        super(type, color, age); //calling the constructor of the parent class
    }

    @Override
    public void display() { //method to display the deer details
        System.out.println("Deer [type=" + type + ", color=" + color + ", age=" + age + "]");
    }

    //additional methods specific to Deer
    public void graze() { //method to graze
        System.out.println(type + " is grazing.");
    }
    public void run() { //method to run
        System.out.println(type + " is running.");
    }
    
}
