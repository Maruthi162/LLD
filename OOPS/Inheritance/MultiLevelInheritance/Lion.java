package OOPS.Inheritance.MultiLevelInheritance;

public class Lion extends WildAnimal {
    private String name;
    private int age;
    private int weight;

    //constructor
    public Lion(int legs, String skinTone, String habitat, String name, int age, int weight){
        super(legs, skinTone, habitat);
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

    //functionalities
    public void roar(){
        System.out.println("Roaring...");
    }

    
}
