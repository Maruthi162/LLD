package SOLID.LiskovSubstitutionPrinciple.VoilationOfLSP;

public class Bird {
    //properties

    private String name;
    private int legs;
    public Bird(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    //setters and getters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNoOfLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }

    //functionalities

    public void eat(){
        System.out.println("Bird id eating...");
    }
    public void fly(){
        System.out.println("Bird is flying...");
    }
}
