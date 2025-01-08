public class Car {

    private Engine engine;

    //Constructor dependency injection

    //public Car(Engine engine) {
        //this.engine = engine;
    //}

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }

}
