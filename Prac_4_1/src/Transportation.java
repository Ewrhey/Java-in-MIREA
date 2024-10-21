public abstract class Transportation {
    protected int averageSpeed;

    public Transportation(int averageSpeed){
        this.averageSpeed = averageSpeed;
    };

    public int getAverageSpeed() {
        return averageSpeed;
    }

    protected abstract int getJourneyPrice(int distance);
    protected abstract int getJourneyTime(int distance);
}
