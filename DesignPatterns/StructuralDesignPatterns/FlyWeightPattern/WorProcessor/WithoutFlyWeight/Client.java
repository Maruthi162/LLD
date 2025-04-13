package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithoutFlyWeight;

public class Client {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", "Golden", "Savannah", "Meat");
        lion.eat(); //Simba is eating Meat.
        lion.sleep(); //Simba is sleeping in Savannah.

        Horse horse = new Horse("Spirit", "Brown", "Grassland", "Grass");
        horse.eat(); //Spirit is eating Grass.
        horse.sleep(); //Spirit is sleeping in Grassland.
        horse.gallop(); //Spirit is galloping.

        //Here we have created two classes Lion and Horse which have some common properties like name, color, habitat and food.
        //THis will consume more memory as we are creating two different classes for Lion and Horse.
        //If we want to create more animals like Deer, Tiger, etc. then we have to create separate classes for each animal.
        //in order to reduce the memory consumption we can use Flyweight pattern.
        
    }
}
