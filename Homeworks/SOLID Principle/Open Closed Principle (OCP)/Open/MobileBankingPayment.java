package Open;

public class MobileBankingPayment implements PaymentService {
    int amountt;

    public void payment(int amount) {
        amountt = amount;
        System.out.println(amount + " taka paid by mobile bank");
    }

}
