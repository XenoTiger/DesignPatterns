package product;

import factory.Vehicle;

public class Verna implements Vehicle {

    @Override
    public void average() {
        System.out.println("Verna average is->" + 17);
    }
}
