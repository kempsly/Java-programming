public class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called! The breed is : " + breed);
    }
    //hide eat method from the parent
    @Override
    void eat(){
        super.eat();
        System.out.println("This dog eats food!");
    }
    void animalEat(){
        super.eat();
    }

    //void bark(){
    //    System.out.println("This dog barks");
    //}
    @Override
    void makeSound() {
        System.out.println(name + " This dog barks.");
    }
    void fetch(){
        System.out.println("The dog is fetching a ball");
    }
}
