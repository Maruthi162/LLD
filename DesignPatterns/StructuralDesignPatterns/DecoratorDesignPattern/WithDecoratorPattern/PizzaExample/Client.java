package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern.WithDecoratorPattern.PizzaExample;

public class Client {
    public static void main(String[] args) {

        //Pizza with Extra Chees and spicy
        Pizza pizza = new BasePizza(); //base pizza
        pizza = new  ExtraChees(pizza);
        pizza = new Spicy(pizza);

        System.out.println(pizza.getDescription()+ ": "+pizza.getCost()+"$");

        //Pizza with extra chees and mushrooms
        Pizza pizza1 = new BasePizza();
        pizza1 = new ExtraChees(pizza1);
        pizza1 = new Mushroom(pizza1);

        System.out.println(pizza1.getDescription()+ " : "+ pizza1.getCost()+"$");

    }
}
