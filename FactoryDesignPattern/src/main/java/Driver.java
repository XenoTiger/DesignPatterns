import factory.Shape;
import factory.ShapeFactory;

public class Driver {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
    }
}
