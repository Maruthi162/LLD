package OOPS.Inheritance.HybridInheritance;

public class Bird extends Animal {
    private String color;
    private String name;
    
    //constructor
    public Bird(int legs, String color, String name){
        super(legs);
        this.color = color;
        this.name = name;
    }

    //setters and getters
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    //functionalities
    public void flapWings(){
        System.out.println("Bird is flapping wings...");
    }
    @Override
    public void makeSound(){
        System.out.println("Bird is chirping...");
    }
    
}
