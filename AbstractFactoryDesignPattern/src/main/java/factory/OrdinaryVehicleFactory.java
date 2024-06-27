package factory;

public class OrdinaryVehicleFactory implements VehicleFactory {


    @Override
    public Vehicle getVehicle(String input) {
        return switch (input) {
            case "product.Swift" -> new Swift();
            case "product.Verna" -> new Verna();
            default -> null;
        };
    }
}
