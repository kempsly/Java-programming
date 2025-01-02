public class Smartphone {
    private String model;
    private String brand;
    private double price;


    //USING COPY CONSTRUCTOR
    public Smartphone (Smartphone mySmartphone){
        this.model = mySmartphone.model;
        this.brand = mySmartphone.brand;
        this.price = mySmartphone.price;
    }

    public Smartphone(String model, String brand, double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage){
        this.price -= this.price*(discountPercentage/100);
    }
    public void comparePrice(Smartphone otherSmartPhone){
        if(this.price < otherSmartPhone.price){
            System.out.println(this.model + " is cheaper than " + otherSmartPhone.model);
        }else if(this.price > otherSmartPhone.price){
            System.out.println(this.model + " is more expensive than " + otherSmartPhone.model);
        }else {
            System.out.println(this.model + " is as expensive as " + otherSmartPhone.model);
        }

    }
    public void displayDetails(){
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}
