package patterns.design.CorePatterns.Singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        SingletonDemo instance = SingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Adnan");
        System.out.println(instance.getName());
    }
}
