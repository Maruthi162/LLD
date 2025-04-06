package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.CofeeExample;

public interface Coffee {

    public String getDescription();
    public double getCost();

}

//Componeent interface: which will be implemented by concrete component and decorator
//this component includes the methods that will be implemented by concrete component and decorator
