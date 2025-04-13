package DesignPatterns.StructuralDesignPatterns.CompositePattern.Examples.Shapes_Colours_Example;

public class Triangle implements Shape {
    private String color; //color of the triangle

    public Triangle(String color) { //constructor to initialize the color of the triangle
        this.color = color;
    }

    @Override
    public void draw() { //method to draw the triangle
        System.out.println("Drawing a " + color + " triangle.");
    }
    
}
