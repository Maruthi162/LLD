package OOPS.Inheritance.MultiLevelInheritance;

public class Animals {
    private int noOfLegs;
    private String skinTone;

    //constructor
    public Animals(int legs, String skinTone){
        this.noOfLegs = legs;
        this.skinTone = skinTone;
    }

    //setters and getters
    public void setNoOfLegs(int legs){
        this.noOfLegs = legs;
    }
    public int getNoOfLegs(){
        return this.noOfLegs;
    }
    public void setSkinTone(String skinTone){
        this.skinTone = skinTone;
    }
    public String getSkinTone(){
        return this.skinTone;
    }

    //functionalities
    public void eat(){
        System.out.println(" Eating...");
    }
    public void sleep(){
        System.out.println(" Sleeping...");
    }
    public void makeSound(){
        System.out.println(" Making sound...");
    }


}
