public class Main {
    public static void main(String[] args) {
        Engine myengine = new Engine();
        Car myCar = new Car();
        myCar.setEngine(myengine);
        myCar.drive();


        ElectricEngine myElEngine = new ElectricEngine();
        myCar.setEngine(myElEngine);

    }
}