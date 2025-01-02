import java.util.Scanner;

public class MethodReturningOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter a second whole number");
        int num2 = scanner.nextInt();
        int result = add(num1, num2);
        System.out.println("The result od adding the 2 number is : " + result);

    }
    public static int add(int num1, int num2){
        return num1 + num2;

    }
    public static int substract(int num1, int num2){
        return num1 - num2;
    }
}
