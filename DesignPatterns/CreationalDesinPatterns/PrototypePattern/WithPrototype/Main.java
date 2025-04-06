package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithPrototype;


public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(5);
        circle1.toString();
        Shape circle2 = circle1.clone();
        circle2.toString();

        //Customizing the cloned object circle2 from circle1
        ((Circle)circle2).setRadius(10);

        circle2.toString();

        Shape square1 = new Square(5, 5);
        square1.toString();
        Shape square2 = square1.clone();
        square2.toString();

        //Customizing the cloned object square2 from square1
        ((Square)square2).setHeight(10);
        square2.toString();


    }
}
