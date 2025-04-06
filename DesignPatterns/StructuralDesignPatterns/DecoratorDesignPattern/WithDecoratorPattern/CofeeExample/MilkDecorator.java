package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.CofeeExample;


public class MilkDecorator extends CoffeeDecorator {

    // Constructor
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    // Overriding methods
    @Override
    public String getDescription(){
        return coffee.getDescription() + "+ Milk";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 2.0;
    }
}

//Concrete decorator class which extends the CoffeeDecorator class
//this class will have a constructor which will take the Coffee object as a parameter
//this class will override the methods of the CoffeeDecorator class and will add the cost of the decorator to the cost of the coffee object
