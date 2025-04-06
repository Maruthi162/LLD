package SOLID.LiskovSubstitutionPrinciple.VoilationOfLSP;

public class Duck extends Bird {
    private double swimmingSpeed;

    public Duck(double swimmingSpeed, String name, int legs){
        super(name, legs);
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getSwimmingSpeed(){
        return this.swimmingSpeed;
    }
    public void setSwimmingSpeed(double speed){
        this.swimmingSpeed = speed;
   }

   @Override
   public void eat(){
    System.out.println("Duck is eating");
   }

   @Override
   public void fly(){
    System.out.println("Duck is swimming...");
   }
}
