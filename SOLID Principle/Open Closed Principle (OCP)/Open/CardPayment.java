package Open;

public class CardPayment implements PaymentService {
    int id;
    int amount;

    public void payment(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

}