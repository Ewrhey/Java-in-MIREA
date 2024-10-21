public class Train extends Transportation{

    public Train(int averageSpeed){super(averageSpeed);};

    @Override
    protected int getJourneyPrice(int distance) {
        int pricePerHourRU = 240;
        return (distance / averageSpeed) * pricePerHourRU;
    }

    @Override
    protected int getJourneyTime(int distance) {
        return distance / averageSpeed;
    }

}