package product;

import factory.Vehicle;

public class Bmw implements Vehicle {

    @Override
    public void average() {
        System.out.println("BMW average is->" + 10);
    }
}
