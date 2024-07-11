/**
 * This represents Null object pattern, Here if we don't provide object, so it will take default behaviour.
 * By providing default values, we don't have to perform null checks again and again.
 *
 * @author Niraj_Bhoyar
 */
public class Driver {

    public static void main(String[] args) {

        /* here we have provided Bike object but as implementation is not there for Bike, we are getting default values
            in result. If we don't use this pattern, Then it will throw NPE at line no. 16 and 17
         */
        Vehicle vehicle = VehicleFactory.getVehicleFactory("Bike");

        System.out.println("Vehicle Fuel Capacity: " + vehicle.getTankCapacity());
        System.out.println("Vehicle Starting Capacity: " + vehicle.getStartingCapacity());
    }


}
