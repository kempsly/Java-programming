public class Device {
    String brand;
    String model;

    Device(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    void displayInfo(){
        System.out.println("The brand is : " + brand);
        System.out.println("The model is : " + model);
    }
    void powerOn(){
        System.out.println("The device is powering on");
    }
}
