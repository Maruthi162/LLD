package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public class ExtraChees extends PizzaDecorator {

    //constructor
    public ExtraChees(Pizza pizza) {
        super(pizza);
    }

    // Overriding methods
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + ExtraChees";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }

}
