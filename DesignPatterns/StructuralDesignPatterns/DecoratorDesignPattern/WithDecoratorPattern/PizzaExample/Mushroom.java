package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public class Mushroom extends PizzaDecorator{
    
    //constructor
    public Mushroom(Pizza pizza){
        super(pizza);
    }

    //Override methods
    public String getDescription(){
        return pizza.getDescription()+" + Mushrooms";
    }

    @Override
    public double getCost(){
        return pizza.getCost() + 30.0;
    }
}
