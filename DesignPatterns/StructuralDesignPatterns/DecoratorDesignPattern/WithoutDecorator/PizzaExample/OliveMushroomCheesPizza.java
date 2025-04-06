package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithoutDecorator.PizzaExample;

public class OliveMushroomCheesPizza extends MushroomCheesPizza {
    
    @Override
    public String getDescription() {
        return "Olive Mushroom Chees Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
    
}
