package product;

import factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}
