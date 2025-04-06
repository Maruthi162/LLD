package OOPS.Inheritance.HybridInheritance;

public class Duck extends Bird implements SwimmingBird {

    private String color;
    
    //constructor
    public Duck(int legs, String color, String name){
        super(legs, color, name);
        this.color = color;
        
    }

    //setters and getters
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    //functionalities
    public void swim(){
        System.out.println("Duck is swimming...");
    }

}

//here Bird class inheriting from Animal class which is single inheritance
//and Duck class inheriting from Bird class also implementing SwimmingBird interface which is multiple inheritance
// so it is a combination of both single and multiple inheritance which is called as Hybrid Inheritance.


