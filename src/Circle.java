/**
 * Created by jarpi on 18/04/18.
 */
public class Circle extends Shape {
    private int radius;
    public Circle(int radius, String color) {
        this.type = "CIRCLE";
        this.color = color;
        this.radius = radius;
    }
    public Circle(int radius) { new Circle(radius, "BLACK"); }
    public Circle(String color) { new Circle(0, "BLACK"); }
    @Override
    public void Draw(Object surface) {/* Draw in the surface... */}
    public void setRadius(int radius) { this.radius = radius; }
    public int getRadius() { return this.radius; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }
}
