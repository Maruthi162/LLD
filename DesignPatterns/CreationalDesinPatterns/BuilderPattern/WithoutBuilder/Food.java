package DesignPatterns.CreationalDesinPatterns.BuilderPattern.WithoutBuilder;

public class Food {
    private String name;
    private String sauce;
    private String sweet;
    private boolean isVeg;
    private boolean isSpicy;

    //constructor : this constructor we can use to create a food object with all the properties. 
    //but some of the properties are optional. still we need to pass null or empty values to the constructor.
    //this is not a good approach.
    public Food(String name, String sauce, String sweet, boolean isVeg, boolean isSpicy) {
        this.name = name;
        this.sauce = sauce;
        this.sweet = sweet;
        this.isVeg = isVeg;
        this.isSpicy = isSpicy;
    }
    //let's say we want to create a food object with only name and isVeg properties.
    public Food(String name, boolean isVeg) {
        this.name = name;
        this.isVeg = isVeg;
    }
    //let's say we want to create a food object with only name and isVeg properties.
    public Food(String name, String sauce) {
        this.name = name;
        this.sauce = sauce;
    }
    //let's say we want to create a food object with only name and isSpcy properties.
    //this constructor is not possible to create a food object with only name and isSpicy properties.
    //since we are already having a constructor with parameters of type String and boolean.

    // public Food(String name, boolean isSpicy) {   
    //     this.name = name;
    //     this.isSpicy = isSpicy;
    // }

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
    

}
