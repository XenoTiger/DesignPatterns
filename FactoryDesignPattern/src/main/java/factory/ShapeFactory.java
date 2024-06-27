package factory;

import product.Circle;
import product.Square;

/**
 * This class represents factory pattern which adds abstraction layer for creating objects.
 * @author Niraj_Bhoyar
 */
public class ShapeFactory {

    public Shape getShape(String input) {
        return switch (input) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
