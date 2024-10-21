public class Car extends Transportation{

    public Car(int averageSpeed){super(averageSpeed);};

    @Override
    protected int getJourneyPrice(int distance) {
        int pricePerHourRU = 1800;
        return (distance / averageSpeed) * pricePerHourRU;
    }

    @Override
    protected int getJourneyTime(int distance) {
        return distance / averageSpeed;
    }

}
