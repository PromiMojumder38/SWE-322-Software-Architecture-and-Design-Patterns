package Open;

public class MobileBankingPayment implements PaymentService {
    public int id;
    public int amountt;

    public void payment(int id, int amount) {
        this.id = id;
        amountt = amount;
    }

}
