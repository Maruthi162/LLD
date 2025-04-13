package DesignPatterns.StructuralDesignPatterns.CompositePattern.Examples.Shapes_Colours_Example;

public class Circle implements Shape {
    private String color; //color of the circle

    public Circle(String color) { //constructor to initialize the color of the circle
        this.color = color;
    }

    @Override
    public void draw() { //method to draw the circle
        System.out.println("Drawing a " + color + " circle.");
    }
    
}
