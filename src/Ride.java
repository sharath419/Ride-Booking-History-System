public class Ride {
    int rideId;
    String pickup;
    String drop;
    double fare;

    public Ride(int rideId, String pickup, String drop, double fare) {
        this.rideId = rideId;
        this.pickup = pickup;
        this.drop = drop;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "RideID: " + rideId +
                ", Pickup: " + pickup +
                ", Drop: " + drop +
                ", Fare: $" + fare;
    }
}