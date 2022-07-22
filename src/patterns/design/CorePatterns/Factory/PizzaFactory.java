package patterns.design.CorePatterns.Factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new CheesePizza();
        } else if(type.equals("chicken")) {
            return new ChickenPizza();
        } else if(type.equals("vege")) {
            return new VegePizza();
        } else return null;
    }
}
