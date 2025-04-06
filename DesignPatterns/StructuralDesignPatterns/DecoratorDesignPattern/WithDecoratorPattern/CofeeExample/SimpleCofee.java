package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.CofeeExample;

public class SimpleCofee implements Coffee {

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
    
}

//this is a base class for all the decorators and it implements the Coffee interface
//we cann add any number of decorators to the coffee object
