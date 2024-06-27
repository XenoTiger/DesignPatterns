package product;

import factory.Vehicle;

public class Mercedes implements Vehicle {

    @Override
    public void average() {
        System.out.println("Mercedes average is->" + 12);
    }
}
