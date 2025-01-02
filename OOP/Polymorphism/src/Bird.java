public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    void fly(){
        System.out.println("This bird can fly");
    }
    @Override
    void eat(){
        super.eat(); //Here, we call the animal eat method
        System.out.println(name + " the bird is pecking at seed.");
    }
    @Override
    void makeSound() {
        System.out.println(name + " the bird is chirping.");
    }
}
