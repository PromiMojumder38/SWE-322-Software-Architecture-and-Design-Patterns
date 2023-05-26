package Single;

public class VisaAssistanceService {
    String passengerName;
    String destination;
    String expiryDate;

    public VisaAssistanceService(String passengerName, String expiryDate, String destination) {
        this.passengerName = passengerName;
        this.expiryDate = expiryDate;
        this.destination = destination;
    }

}
