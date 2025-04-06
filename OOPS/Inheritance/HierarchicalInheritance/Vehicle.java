package OOPS.Inheritance.HierarchicalInheritance;

public class Vehicle {
    private int speed;
    private int noOfwheels;

    //constructor
    public Vehicle(int speed, int noOfwheels){
        this.speed = speed;
        this.noOfwheels = noOfwheels;
    }

    //setters and getters
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getNoOfWheels(){
        return this.noOfwheels;
    }
    public void setNoOfWheels(int noOfwheels){
        this.noOfwheels = noOfwheels;
    }

    //functionalities   
    public void move(){
        System.out.println("Vehicle is moving...");
    }
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }
}

// this is a parent class which is extended by Car and Bike classes. 
// since one parent class is extended by multiple child classes, this is an example of Hierarchical Inheritance.
