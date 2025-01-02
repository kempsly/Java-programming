public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Blacky", "dwarf german");
        //Polymorphism
        Animal myDog2 = new Dog("Brutus", "Berger");

        //Polymorphic method call
        myDog2.makeSound();
        //Direct call of subclass specific method
        //This approach requires casting to the appropriate subclass
        ((Dog)myDog2).fetch();



    }
}