package paymentsystem;

class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}