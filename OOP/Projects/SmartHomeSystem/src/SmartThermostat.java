public class SmartThermostat implements ControllableDevice{

    private boolean isOn = false;
    private double temperature = 25.0;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat is turned ON!");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat is turned OFF!");
    }

    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Smart light status : " + status
        + ", Temperature : " + temperature + " °C");
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println("Temperature set to : " + temperature + " °C");
    }
}
