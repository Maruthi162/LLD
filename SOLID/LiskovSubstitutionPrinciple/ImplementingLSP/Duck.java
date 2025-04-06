package SOLID.LiskovSubstitutionPrinciple.ImplementingLSP;

public class Duck extends Bird implements SwimmingBird, FlyingBird {
    private double swimmingSpeed;

    public Duck(double swimmingSpeed, String name, int legs) {
        super(name, legs);
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return this.swimmingSpeed;
    }
    public void setSwimmingSpeed(double speed) {
        this.swimmingSpeed = speed;
    }

    public void swim() {
        System.out.println("Duck is swimming...");
    }

    public void fly(){
        System.out.println("Duck is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }
    @Override
    public void makeSound(){
        System.out.println("Quack Quack.....");
    }
}
