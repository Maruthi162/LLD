package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.CofeeExample;

public class Client {
    public static void main(String[] args) {
        //get Simple Coffee
        Coffee coffee = new SimpleCofee();
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        //add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        //add buicuits to the coffee
        coffee = new BiscuitDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        coffee = new SamosaDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());


        // If client want only coffee and samosa
        Coffee coffee1 = new SimpleCofee();
        coffee1 = new SamosaDecorator(coffee1);
        System.out.println("Cost: " + coffee1.getCost() + "; Description: " + coffee1.getDescription());

    }
}

//Client class which will use the decorators to add the cost and description of the coffee object
//Client can have anu combination of the decorators to the coffee object
//Client can also have the coffee object without any decorators
