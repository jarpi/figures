package shapes;

import figures.Shape;

public class Circle extends Shape {
    public static final String CIRCLE = "CIRCLE";
    private int radius;
    public Circle(int radius, String color) {
        this.type = CIRCLE;
        this.color = color;
        this.radius = radius;
    }
    public Circle(int radius) { new Circle(radius, "BLACK"); }
    public Circle(String color) { new Circle(0, "BLACK"); }
    public Circle() { new Circle(0, "BLACK"); }
    @Override
    public void draw(Object surface) {/* draw in the surface... */}
    public void setRadius(int radius) { this.radius = radius; }
    public int getRadius() { return this.radius; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }
}
