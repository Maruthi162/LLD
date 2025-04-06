package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithoutDecorator.PizzaExample;

public class MushroomCheesPizza extends CheesPizza {
    
    @Override
    public String getDescription() {
        return "Mushroom Chees Pizza";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
    
}
