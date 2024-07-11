public class Bike implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 15;
    }

    @Override
    public int getStartingCapacity() {
        return 5;
    }
}
