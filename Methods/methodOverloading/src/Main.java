public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers " + sum1);

        double sum2 = calculator.add(5.7, 16.9);
        System.out.println("Sum of two doubles " + sum2);

        int sum3 = calculator.add(5, 10, 40);
        System.out.println("Sum of three integers " + sum3);

    }
}