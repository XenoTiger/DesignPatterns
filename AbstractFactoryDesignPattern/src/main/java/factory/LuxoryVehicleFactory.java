package factory;

public class LuxoryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
        return switch (input) {
            case "product.Mercedes" -> new Mercedes();
            case "product.Bmw" -> new Bmw();
            default -> null;
        };
    }

}
