package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithPrototype;

public class Square implements Shape{

    private double width;
    private double height;

    //constructor
    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }

    //draw method
    @Override
    public void draw(){
        System.out.println("Drawing a Square with width: " + width + " and height: " + height);
    }

    //clone method
    @Override
    public Shape clone() {
        return new Square(this.width, this.height);
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //toString method
    public String toString() {
        return "Square [width=" + width + ", height=" + height + "]";
    }


    
}
