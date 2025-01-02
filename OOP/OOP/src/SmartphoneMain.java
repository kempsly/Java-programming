public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Magic V3", "Honor", 1800);
        Smartphone smartphone2 = new Smartphone("16 Pro Max", "Iphone", 1700);

        //With copy constructor
        Smartphone smartphone3 = new Smartphone(smartphone2);
        smartphone3.applyDiscount(20);

        //Compare 2 and 3
        smartphone2.comparePrice(smartphone3);

        smartphone1.applyDiscount(10);
        smartphone1.comparePrice(smartphone2);

        //Displaying the details about the smartphones
        smartphone1.displayDetails();
        smartphone2.displayDetails();

    }
}
