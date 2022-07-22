package patterns.design.CorePatterns.Singleton;

public enum SingletonDemo {
    INSTANCE("hello", 2);
    private String name;

    SingletonDemo(String val, int val2) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
