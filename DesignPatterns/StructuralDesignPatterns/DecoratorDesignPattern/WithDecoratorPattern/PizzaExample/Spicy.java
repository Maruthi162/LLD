package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public class Spicy extends PizzaDecorator {
    
    //constructor
    public Spicy(Pizza pizza){
        super(pizza);
    }

    //override methods
    @Override
    public String getDescription(){
        return pizza.getDescription()+" + Spicy";
    }

    @Override
    public double getCost(){
        return pizza.getCost();
    }
    
}
