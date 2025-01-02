import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and modify array elements
        System.out.println("First element: " + numbers[0]);
        numbers[0] = 10;
        System.out.println("Modified first element: " + numbers[0]);

        // Iterate over the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Create a copy of the array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Array copy: " + Arrays.toString(copy));
    }
}
