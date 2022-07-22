package patterns.design.CorePatterns.Factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing CCheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting CCheese Pizza");

    }

    @Override
    public void bake() {
        System.out.println("Baking CCheese Pizza");

    }
}
