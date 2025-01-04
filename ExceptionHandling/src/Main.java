import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to divide 10 by : ");
        try{
            int userInput = scanner.nextInt();
            int result = 10 / userInput;
            System.out.println("The result is : " + result);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        System.out.println("Still works");

    }
}