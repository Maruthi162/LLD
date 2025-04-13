package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern.WorProcessor.WithFlyWeight;

public class Client {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Lion", "Golden", 5); //creating a lion object
        lion1.display(); //displaying the lion details
        lion1.eat(); //calling the eat method of the lion object
        lion1.roar(); //calling the roar method of the lion object

        Deer deer1 = new Deer("Deer", "Brown", 3); //creating a deer object 
        deer1.display(); //displaying the deer details
        deer1.eat(); //calling the eat method of the deer object
        deer1.graze(); //calling the graze method of the deer object
        deer1.run(); //calling the run method of the deer object
    }
}
