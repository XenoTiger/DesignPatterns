public class VehicleFactory {

    static Vehicle getVehicleFactory(String vehicle) {
        if ("Car".equals(vehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
