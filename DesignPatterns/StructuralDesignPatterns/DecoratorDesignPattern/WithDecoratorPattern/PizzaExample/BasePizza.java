package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public class BasePizza implements Pizza {

    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Base Pizza";
    }
    
}
