import java.util.Scanner;

public class RcursiveMethodFactorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number to get it's factorial :");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of : " + num + " is " + result);
        scanner.close();
    }
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
