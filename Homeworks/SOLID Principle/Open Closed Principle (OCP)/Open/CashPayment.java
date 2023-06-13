package Open;

public class CashPayment implements PaymentService {
    int amount;

    public void payment(int amount) {
        this.amount = amount;
        System.out.println(amount + " taka paid by cash");
    }

}
