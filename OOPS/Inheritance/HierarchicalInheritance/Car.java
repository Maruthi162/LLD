package OOPS.Inheritance.HierarchicalInheritance;

public class Car extends Vehicle {
    private String model;
    private String color;

    //constructor
    public Car(int speed, int noOfwheels, String model, String color){
        super(speed, noOfwheels);
        this.model = model;
        this.color = color;
    }

    //setters and getters
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //functionalities
    public void honk(){
        System.out.println("Car is honking...");
    }
    public void accelerate(){
        System.out.println("Car is accelerating...");
    }
}

//this is child class of Vehicle class. Since this class is extending Vehicle class, this is an example of Hierarchical Inheritance.
