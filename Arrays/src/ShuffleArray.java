public class ShuffleArray {
    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = nums.length / 2; // Determine the value of n

        // Create a new array to store the rearranged elements
        int[] rearranged = new int[nums.length];

        // Rearrange the array in the form [x1, y1, x2, y2, ..., xn, yn]
        for (int i = 0; i < n; i++) {
            rearranged[2 * i] = nums[i];       // Assign x1, x2, ..., xn to even indices
            rearranged[2 * i + 1] = nums[i + n]; // Assign y1, y2, ..., yn to odd indices
        }

        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int i : rearranged) {
            System.out.print(i + " ");
        }
    }
}
