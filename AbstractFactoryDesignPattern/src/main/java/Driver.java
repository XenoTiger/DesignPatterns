import factory.VehicleFactory;

public class Driver {

    public static void main(String[] args) {

        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        VehicleFactory vehicleFactory
                = abstractVehicleFactory.getVehicleFactory("factory.OrdinaryVehicleFactory");
        vehicleFactory.getVehicle("product.Verna").average();

    }

}
