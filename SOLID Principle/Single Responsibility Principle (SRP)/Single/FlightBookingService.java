package Single;

public class FlightBookingService {
    String passengerName;
    String destination;
    String date;
    String vehicleName;

    public FlightBookingService(String passengerName, String date, String vehicleName, String destination) {
        this.passengerName = passengerName;
        this.date = date;
        this.vehicleName = vehicleName;
        this.destination = destination;
    }
}
