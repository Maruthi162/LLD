package SOLID.LiskovSubstitutionPrinciple.VoilationOfLSP;

public class Ostrich extends Bird{
    private String feedingType;

    public Ostrich(String feedingType, String name, int legs){
        super(name, legs);
        this.feedingType = feedingType;
    }

    public String getFeedingType(){
        return this.feedingType;
    }
    public void setFeedingType(String type){
            this.feedingType = type;
    }

    @Override
    public void eat(){
        System.out.println("Ostrich is eating....");
    }

    @Override
    public void fly(){
        System.out.println("Ostrich can't fly");   // here the liskv substitution priciple has been broken since fly method changing the behaviour of the super class Bird
    }
    
}


// as per the Liskv Substitution principle object of child class should be replacable with the object of super class
/*
 * The Bird superclass likely defines a fly() method that implies all birds can fly.
    However, the Ostrich class overrides the fly() method to indicate that ostriches cannot fly. 
    This changes the behavior of the fly() method in a way that breaks the expectations set by the Bird class.
 */