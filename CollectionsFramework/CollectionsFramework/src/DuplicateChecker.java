import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChecker {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            // Maintain the size of the HashSet to be no larger than k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Output: " + result);
    }
}