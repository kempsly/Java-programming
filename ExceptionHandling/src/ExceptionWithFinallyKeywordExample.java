import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWithFinallyKeywordExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to divide 10 by : ");
        try{
            int userInput = scanner.nextInt();
            int result = 10 / userInput;
            System.out.println("The result is : " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception, don't divide by zero(0)");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException exception, enter only numbers!");
        } catch (Exception e) {
            System.out.println("Exception caught, something unexpected happened."
                    + e.getMessage());
        } finally {
            scanner.close();
            //System.out.println("Finally: It's going to run anyways");
        }

        System.out.println("Still works");

    }
}

