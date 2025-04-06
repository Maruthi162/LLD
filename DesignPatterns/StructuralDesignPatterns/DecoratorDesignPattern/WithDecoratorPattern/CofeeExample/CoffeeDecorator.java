package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.CofeeExample;

public abstract class CoffeeDecorator implements Coffee {
    
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return "Simple coffee";
    }

    @Override
    public double getCost(){
        return 10.0;
    }
    
}

//this is abstract decorator class which implements the Coffee interface and has a reference to the Coffee object
//this class will be extended by all the concrete decorators
//this class will have a constructor which will take the Coffee object as a parameter

