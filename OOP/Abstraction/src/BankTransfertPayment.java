public class BankTransfertPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing bank transfer payment of $ " + amount);
        confirmPayment();

    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing bank transfer transaction with account verification...");


    }
}
