public abstract class Payment {

    abstract void processPayment(double amount);

    abstract  void initializeTransaction();

    void confirmPayment(){
        System.out.println("Payment confirmed.");
    }

}
