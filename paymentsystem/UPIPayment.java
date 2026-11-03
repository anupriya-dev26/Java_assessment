package paymentsystem;

class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}
