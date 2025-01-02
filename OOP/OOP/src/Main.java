public class Main {
    public static void main(String[] args) {
        //SmartDevice honorMagicV2 = new SmartDevice();
        SmartAppliance appliance1 = new SmartAppliance("Air Conditionner",
                "Cooling", "ON");
        //Creating a new instance
        SmartAppliance appliance2 = appliance1.getInstance();
        //Creating a reference to the other object
        SmartAppliance appliance3 = appliance1;
        //Using method chaining
        appliance1.setApplianceName("Set Air Con")
                .setApplianceType("Cooling Mooling")
                .setPowerStatus("Off");

        //appliance2.applianceName = "Air Con2";
        //After setting the variables from the class
        // SmartAppliance private, we should use
        // setters for setting the value to them

        appliance2.displayDetails();
        System.out.println("----------------------");
        //appliance3.applianceName = "Air Con3";
        appliance3.displayDetails();
        System.out.println("----------------------");
        appliance1.displayDetails();



        //############################
        //############################
        //############################
        //Car myToyota = new Car();
        //myToyota.color = "Red";
        //myToyota.model = "Toyota";
        //myToyota.year = 2023;
        //myToyota.showDetails();

        //Car myAudi = new Car();
        //myAudi.color = "Black";
        //myAudi.model = "A3";
        //myAudi.year = 2018;
        //myAudi.showDetails();

        //System.out.println("My toyota is : " + myToyota.color);
        //System.out.println("My Audi is : " + myAudi.color);

    }
}