public class IterativeFactorialExample {
    public static void main(String[] args) {
        System.out.println(factorial(9)); // Example usage
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i at each step
        }
        return result; // Return the final result
    }
}