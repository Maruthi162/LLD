package OOPS.Inheritance.MultipleInheritance;

//Her duck is a bird, so it extends Bird class
//Duck can fly and swim, so it implements FlyingBird and SwimmingBirds interfaces
//we have achieved multiple inheritance using interfaces
public class Duck extends Bird implements FlyingBird,SwimmingBirds {
    private int age;
    private String petName;

    //constructor
    public Duck(String name, int legs, String color){
        super(name, legs, color);
    }   

    //setters and getters
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPetName(){
        return this.petName;
    }
    public void setPetName(String petName){
        this.petName = petName;
    }


    //functionalities
    public void fly(){
        System.out.println("Duck is flying...");
    }
    public void makeSound(){
        System.out.println("Duck is making sound...");
    }
    public void swim(){
        System.out.println("Duck is swimming...");
    }
    
}
