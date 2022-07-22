package patterns.design.CorePatterns.Flyweight;

public class Circle extends Shape {

    private String label;

    public Circle() {
        label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColour, String lineColour) {
        System.out.println("Drawing a " + label + " with radius " + radius + " - fill colour " + fillColour + " line colour " + lineColour);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
