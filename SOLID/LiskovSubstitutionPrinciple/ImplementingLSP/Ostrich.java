package SOLID.LiskovSubstitutionPrinciple.ImplementingLSP;

public class Ostrich extends Bird {
    public Ostrich(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating...");
    }
    @Override
    public void makeSound(){
        System.out.println("Ostrich is making sound...");
    }
    
}
