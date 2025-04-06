package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithoutDecorator.PizzaExample;

public class CheesPizza extends Pizza {
    
    @Override
    public String getDescription() {
        return "Chees Pizza";
    }

    @Override
    public double getCost() {
        return 130.0;
    }
    
}
