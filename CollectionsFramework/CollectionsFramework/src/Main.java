import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Creating an array list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Creating LinkedList
        LinkedList<String> myFruits = new LinkedList<>();
        myFruits.add("Apple");
        myFruits.add("Banana");
        myFruits.add("Cherry");
        myFruits.addFirst("Orange");
        myFruits.addLast("Strawberry");


        System.out.println("The first fruits item is : " + fruits.get(0));
        //Alternatively, we can use :
        //System.out.println("The first fruits item is : " + fruits.getFirst());

        // Display all the elements from fruits
        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}