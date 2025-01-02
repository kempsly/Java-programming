public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Apple",
                "m4 pro", 64, 1024,
                1800, 14);
        myLaptop.powerOn();
        myLaptop.displayInfo();

    }
}