package SOLID.LiskovSubstitutionPrinciple.ImplementingLSP;

public class Bird {
    private String name;
    private int legs;

    public Bird(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getlegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }

    public void eat(){
        System.out.println("Bird is eating....");
    }

    public void makeSound(){
        System.out.println("make sound");
    }
    
}
