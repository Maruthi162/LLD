package DesignPatterns.CreationalDesinPatterns.BuilderPattern.WithoutBuilder;

public class FoodUsingSetters {
    //properties
    private String name;
    private String sauce;
    private String sweet;
    private boolean isVeg;
    private boolean isSpicy;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSweet() {
        return sweet;
    }

    public void setSweet(String sweet) {
        this.sweet = sweet;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
    }

    //to String method
    @Override
    public String toString() {
        return "Food [isSpicy=" + isSpicy + ", isVeg=" + isVeg + ", name=" + name + ", sauce=" + sauce + ", sweet="
                + sweet + "]";
    }
    

    public static void main(String[] args) {
        //object -1
        FoodUsingSetters food = new FoodUsingSetters();
        //set the required properties, ignore not required properties
        food.setName("Biryani");
        food.setSauce("Tomato");
        food.setSweet("Gulab Jamun");
        food.setVeg(false);
        food.setSpicy(true);
        
        food.toString();  //Food [isSpicy=true, isVeg=false, name=Biryani, sauce=Tomato, sweet=Gulab Jamun]

        //object -2
        FoodUsingSetters food2 = new FoodUsingSetters();
        //set the required properties, ignore not required properties
        food2.setName("Pulav");
        food2.setSpicy(true);
        food2.setVeg(true);

        food2.toString();  //Food [isSpicy=true, isVeg=true, name=Pulav, sauce=null, sweet=null]


    }
}

// this approach is good compared to multiple constructors approach.
// but still we need to remember the order of the properties to set the values. and there we have to call setters multiple times.
// this approach is not good when we have large number of properties to set.
// we can use the Builder Pattern to overcome these issues.
// The Builder Pattern is a creational design pattern that lets you construct complex objects step by step.
