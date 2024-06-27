package factory;

import product.Bmw;
import product.Mercedes;

public class LuxoryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
        return switch (input) {
            case "Mercedes" -> new Mercedes();
            case "Bmw" -> new Bmw();
            default -> null;
        };
    }

}
