public class Plane extends Transportation{

    public Plane(int averageSpeed){super(averageSpeed);};

    @Override
    protected int getJourneyPrice(int distance) {
        int pricePerHourRU = 3000000;
        return (distance / averageSpeed) * pricePerHourRU;
    }

    @Override
    protected int getJourneyTime(int distance) {
        return distance / averageSpeed;
    }

}