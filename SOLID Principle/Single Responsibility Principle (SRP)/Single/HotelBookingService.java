package Single;

public class HotelBookingService {
    String passengerName;
    String destination;
    int numberOfDays;

    public HotelBookingService(String passengerName, String destination, int numberOfDays) {
        this.passengerName = passengerName;
        this.numberOfDays = numberOfDays;
        this.destination = destination;
    }

}
