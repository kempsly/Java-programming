package mapInterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){

        Map<String, String> capitals = new HashMap();
        capitals.put("USA", "Washington, D.C");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Russia", "Moscow");

        //Access value by key
        System.out.println("Capital of Russia : " + capitals.get("Russia"));
        capitals.remove("Germany");
        capitals.replace("France", "Marseille");
        boolean containPortugal = capitals.containsKey("Portugal");
        System.out.println("Contains Portugal : " + containPortugal);
        if(!containPortugal){
            capitals.put("Portugal", "Lisbon");
        }

        for(Map.Entry<String, String> entry : capitals.entrySet()){
            System.out.println("Country : " + entry.getKey()
                    + " Capital : " + entry.getValue());
        }
    }
}
