package paymentsystem;

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}