public class Car {
    //Properties - Attributes
    String color;
    String model;
    String brand;
    int year;
    int batteryLife;
    boolean isConnected;

    void showDetails(){
        System.out.println("This car is a " + model +
                " and is " + color + " and was built in " + year);

    }

    void connect(){
        System.out.print("connecting device");
        isConnected = true;
    }
    void disconnect(){
        System.out.print("Disconnecting device");
        isConnected = false;
    }
    void displayStatus(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Connected: " + isConnected);
        //System.out.println("Brand: " + brand);
    }
}
