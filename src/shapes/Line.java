package shapes;

import figures.Shape;

public class Line extends Shape {
    public static final String LINE = "LINE";
    private int length;
    public Line(int length, String color) {
        this.type = LINE;
        this.color = color;
        this.length = length;
    }
    public Line(int length) { new Line(length, "BLACK"); }
    public Line(String color) { new Line(0, "BLACK"); }
    public Line() { new Line(0, "BLACK"); }
    @Override
    public void draw(Object surface) {/* draw in the surface... */}
    public void setLength(int length) { this.length = length; }
    public int getLength() { return this.length; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }
}
