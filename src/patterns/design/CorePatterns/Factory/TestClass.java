package patterns.design.CorePatterns.Factory;

public class TestClass {

    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        ps.orderPizza("vege");
    }
}
