public class PassByValueExample {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);
        modifyValue(num);  // Pass by value
        System.out.println("After method call: " + num);  // num is unchanged
    }

    public static void modifyValue(int number) {
        number = 20;  // Changes the local copy, not the original value
        System.out.println("Inside method: " + number);
    }
}
