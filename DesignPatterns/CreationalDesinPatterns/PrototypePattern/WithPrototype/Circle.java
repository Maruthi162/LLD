package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithPrototype;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //draw method
    @Override
    public void draw(){
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    //clone method
    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //toString method
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    


} 
    
