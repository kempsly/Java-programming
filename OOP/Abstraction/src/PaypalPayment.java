public class PaypalPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing paypal payment of $ " + amount);
        confirmPayment();

    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing Paypal" +
                "Transaction And connecting to Paypal API....");

    }
}
