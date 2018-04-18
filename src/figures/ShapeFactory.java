package figures;

import shapes.Circle;

public class ShapeFactory {

    public static IShape getShape(String shapeName) throws Exception {
        if (shapeName.equalsIgnoreCase("CIRCLE")) return new Circle();
        throw new Exception("figures.Shape not implemented");
    }

}






