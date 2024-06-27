import factory.LuxoryVehicleFactory;
import factory.OrdinaryVehicleFactory;
import factory.VehicleFactory;

/**
 * This class represents Abstract factory pattern, its factory of factory
 * which adds new abstraction layer on top of Factory.
 *
 * @author Niraj_Bhoyar
 */
public class AbstractVehicleFactory {

    VehicleFactory getVehicleFactory(String input) {

        return switch (input) {
            case "factory.LuxoryVehicleFactory" -> new LuxoryVehicleFactory();
            case "factory.OrdinaryVehicleFactory" -> new OrdinaryVehicleFactory();
            default -> null;
        };
    }
}
