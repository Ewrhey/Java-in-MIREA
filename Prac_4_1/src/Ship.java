public class Ship extends Transportation{

    public Ship(int averageSpeed){super(averageSpeed);};

    @Override
    protected int getJourneyPrice(int distance) {
        int pricePerHourRU = 83 * 35;
        return (distance / averageSpeed) * pricePerHourRU;
    }

    @Override
    protected int getJourneyTime(int distance) {
        return distance / averageSpeed;
    }

}