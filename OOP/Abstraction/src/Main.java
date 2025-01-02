public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();
        Payment bankTransfertPayment = new BankTransfertPayment();

        creditCardPayment.processPayment(100.00);
        paypalPayment.processPayment(50.00);
        bankTransfertPayment.processPayment(250.00);
        

    }
}