public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 45;
    }

    @Override
    public int getStartingCapacity() {
        return 10;
    }
}
