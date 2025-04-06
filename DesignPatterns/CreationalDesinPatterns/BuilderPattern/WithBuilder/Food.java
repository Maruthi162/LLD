package DesignPatterns.CreationalDesinPatterns.BuilderPattern.WithBuilder;

public class Food {
    private String name;
    private String sauce;
    private String sweet;
    private boolean isVeg;
    private boolean isSpicy;

    //constructor: private constructor. so that no one can create an object of Food class directly.
    //only way to create an object of Food class is using the builder class.
    private Food(FoodBuilder builder){

        this.name = builder.name;
        this.sauce = builder.sauce;
        this.sweet = builder.sweet;
        this.isVeg = builder.isVeg;
        this.isSpicy = builder.isSpicy;
    }

    //let's take builder class as inner class of Food class
    public static class FoodBuilder{

        //builder class will have same properties as Food class
        private String name;
        private String sauce;
        private String sweet;
        private boolean isVeg;
        private boolean isSpicy;
        

        //builder class will have setters for all the properties. but it will return the builder object.
        public  FoodBuilder setName(String name){
            this.name = name;
            return this;
        }
        public FoodBuilder setSauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public FoodBuilder setSweet(String sweet){
            this.sweet = sweet;
            return this;
        }
        public FoodBuilder setIsVeg(boolean isVeg){
            this.isVeg = isVeg;
            return this;
        }
        public FoodBuilder setIsSpicy(boolean isSpicy){
            this.isSpicy = isSpicy;
            return this;
        }
        //builder class will have a build method which will return the Food object.
        public Food build()
        {
            return new Food(this);
        }
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }

    public String getSweet() {
        return sweet;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public boolean isSpicy() {
        return isSpicy;
    }
    //TO STRING METHOD
    @Override
    public String toString() {
        return "Food [isSpicy=" + isSpicy + ", isVeg=" + isVeg + ", name=" + name + ", sauce=" + sauce + ", sweet="
                + sweet + "]";
    }
    public static void main(String[] args) {
        //object -1
        Food food1 = new Food.FoodBuilder().setName("Biryani").setSauce("Tomato").setSweet("Gulab Jamun").setIsVeg(false).setIsSpicy(true).build();
        food1.toString();

        //object -2
        Food food2 = new Food.FoodBuilder().setName("Pulav").setIsVeg(true).build();
        food2.toString();

        //object -3
        Food food3 = new Food.FoodBuilder().setName("Ice Cream").setSauce("Chocolate").build();
        food3.toString();
    }
}
