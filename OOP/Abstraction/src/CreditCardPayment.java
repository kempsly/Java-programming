public class CreditCardPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing credit card payment of $ " + amount);
        confirmPayment();

    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing credit card payment");

    }
}
