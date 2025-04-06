package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithoutPrototype;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int price;

    //constructor
    public Car(String brand, String model, String color, int price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //getters and setters
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //to string method
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + ", model=" + model + ", price=" + price + "]";
    }
    
    
}
