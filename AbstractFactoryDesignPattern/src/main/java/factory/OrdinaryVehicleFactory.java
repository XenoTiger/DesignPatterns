package factory;

import product.Swift;
import product.Verna;

public class OrdinaryVehicleFactory implements VehicleFactory {


    @Override
    public Vehicle getVehicle(String input) {
        return switch (input) {
            case "Swift" -> new Swift();
            case "Verna" -> new Verna();
            default -> null;
        };
    }
}
