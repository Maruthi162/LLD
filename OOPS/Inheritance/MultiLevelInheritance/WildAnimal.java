package OOPS.Inheritance.MultiLevelInheritance;

public class WildAnimal extends Animals {
    private String habitat;

    //constructor
    public WildAnimal(int legs, String skinTone, String habitat){
        super(legs, skinTone);
        this.habitat = habitat;
    }

    //setters and getters
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return this.habitat;
    }

    //functionalities
    public void hunt(){
        System.out.println("Hunting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Wild Animal is making sound...");
    }
    
}
