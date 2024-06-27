import factory.VehicleFactory;

public class Driver {

    public static void main(String[] args) {

        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        VehicleFactory vehicleFactory
                = abstractVehicleFactory.getVehicleFactory("OrdinaryVehicleFactory");
        vehicleFactory.getVehicle("Verna").average();

    }

}
