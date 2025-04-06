package OOPS.Inheritance.MultiLevelInheritance;

public class Client {
    public static void main(String[] args) {
        Lion lion = new Lion(4, "Yellow", "Forest", "Simba", 5, 200);
        lion.makeSound();
        lion.hunt();
        lion.run();
        lion.roar();
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Weight: " + lion.getWeight());
        System.out.println("Habitat: " + lion.getHabitat()); //inherited from WildAnimal
        System.out.println("Skin Tone: " + lion.getSkinTone()); //inherited from WildAnimal
        System.out.println("No of legs: " + lion.getNoOfLegs()); //inherited from Animals
    }
}
