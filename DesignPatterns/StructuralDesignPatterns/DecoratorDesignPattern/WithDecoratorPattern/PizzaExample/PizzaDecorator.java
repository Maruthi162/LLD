package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public abstract class PizzaDecorator implements Pizza{
    
    protected Pizza pizza; //reference to the Pizza object
    //constructor
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
