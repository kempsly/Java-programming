public class Computer extends Device{
    int ram;
    int storage;

    Computer(String brand, String model, int ram, int storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("RAM : " + ram);
        System.out.println("STORAGE : " + storage);

    }
    @Override
    void powerOn(){
        System.out.println("The computer is power on");
    }
}
