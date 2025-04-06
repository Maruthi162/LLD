package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithoutDecorator.PizzaExample;

public class Client {
    public static void main(String[] args) {
        
        //Pizza with Extra Chees and Mushrooms
        Pizza pizza = new MushroomCheesPizza();
        System.out.println(pizza.getDescription()+ ": "+pizza.getCost()+"$");

        //Pizza with Olive, Mushroom and Extra Chees
        Pizza pizza1 = new OliveMushroomCheesPizza();
        System.out.println(pizza1.getDescription()+ " : "+ pizza1.getCost()+"$");


        //here we can create direct object for the combo pizza, 
        //but if we want to add more toppings then we have to create new class for that
        //and also we have to create new class for all possible combinations
        //and if we want to change the price of the pizza then we have to change the price in all the classes
        //which is not a good design
    }
}
