public class ExceptionPropagationExample {
    public static void main(String[] args){
        try {
            processOrder();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

    }
    public static void processOrder()throws Exception{
        calculateTotalPrice();
    }
    public static void calculateTotalPrice() throws Exception{
        // When calling this method, it might throw an exception
        checkInventory();
    }
    public static void checkInventory() throws Exception {
        throw new Exception("Insufficient inventory for the order");
    }
}
