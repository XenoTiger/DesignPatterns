package product;

import factory.Vehicle;

public class Swift implements Vehicle {

    @Override
    public void average() {
        System.out.println("Swift average is->" + 20);
    }
}
