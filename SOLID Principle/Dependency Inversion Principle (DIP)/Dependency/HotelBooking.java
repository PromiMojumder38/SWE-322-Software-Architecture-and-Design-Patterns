package Dependency;

import Open.MobileBankingPayment;
import Open.PaymentService;

public class HotelBooking {
    private PaymentService paymentService;

    public HotelBooking(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void doPayment(int amount) {
        paymentService.payment(amount);
    }

    public static void main(String[] args) {
        PaymentService paymentService = new MobileBankingPayment();
        HotelBooking hotelBooking = new HotelBooking(paymentService);
        hotelBooking.doPayment(10000);

    }
}
