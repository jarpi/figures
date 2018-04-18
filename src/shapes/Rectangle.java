package shapes;

import figures.Shape;

public class Rectangle extends Shape {
    public static final String CIRCLE = "CIRCLE";
    private int units;
    public Rectangle(int units, String color) {
        this.type = CIRCLE;
        this.color = color;
        this.units = units;
    }
    public Rectangle(int units) { new Rectangle(units, "BLACK"); }
    public Rectangle(String color) { new Rectangle(0, "BLACK"); }
    public Rectangle() { new Rectangle(0, "BLACK"); }
    @Override
    public void draw(Object surface) {/* draw in the surface... */}
    public void setUnits(int units) { this.units = units; }
    public int getUnits() { return this.units; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }
}
