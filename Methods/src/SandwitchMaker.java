import java.util.Scanner;

public class SandwitchMaker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int amountOfCheese = scanner.nextInt();
        System.out.println("How many slices of cheese do you want in your sandwicth?");
        makeSandwitch(amountOfCheese);

        scanner.close();

    }
    public static void makeSandwitch(int slicesOfCheese){
        System.out.println("Take two slices of bread");
        System.out.println("Spread butter on one slice");
        for(int i=0; i < slicesOfCheese; i++){
            System.out.println("Add a slice of cheese.");
        }
        System.out.println("Put the second slice of bread on top.");
        System.out.println("Sandwitch is ready!");
    }
}

