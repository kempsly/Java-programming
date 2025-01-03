import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Pineapple");
        set.add("Strawberry");
        set.add("Mango");

        System.out.println("Hashset after addition :" + set);
        boolean hasBanana = set.contains("Banana");
        System.out.println("Set contains Banana : " + hasBanana);
        //Remove an element
        set.remove("Banana");
        //Geting the size
        int size = set.size();
        System.out.println("Size of the set : " + hasBanana);

        //Iterate through the set
        for(String element : set){
            System.out.println(element);
        }
        //Delete all items
        set.clear();


    }
}
