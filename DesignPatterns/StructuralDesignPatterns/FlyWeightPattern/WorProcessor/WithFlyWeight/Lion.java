package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithFlyWeight;

public class Lion extends Animal {
    //this is the concrete class for the lion. It extends the abstract class Animal and implements the display method.
    public Lion(String type, String color, int age) { //constructor to initialize the lion object
        super(type, color, age); //calling the constructor of the parent class
    }

    @Override
    public void display() { //method to display the lion details
        System.out.println("Lion [type=" + type + ", color=" + color + ", age=" + age + "]");
    }

    //additional methods specific to Lion
    public void roar() { //method to roar
        System.out.println(type + " is roaring.");
    }
    public void hunt() { //method to hunt
        System.out.println(type + " is hunting.");
    }
}
