import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        System.out.println("Enter a string:");  // Prompt the user to enter a string
        String input = scanner.nextLine();  // Read the input string

        int vowels = 0;  // Initialize vowel counter
        int consonants = 0;  // Initialize consonant counter
        String vowelsList = "aeiouAEIOU";  // Define a string containing all vowels (both lowercase and uppercase)

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the current character

            // Prompt the user if they want to continue or exit
            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String userChoice = scanner.nextLine();  // Read the user's choice

            // If the user chooses to exit, break the loop
            if (userChoice.equalsIgnoreCase("no")) {
                break;
            }

            // If the current character is not a letter, skip it using continue
            if (!Character.isLetter(ch)) {
                continue;
            }

            // Check if the character is a vowel
            if (vowelsList.indexOf(ch) != -1) {
                vowels++;  // Increment vowel counter
            } else {
                consonants++;  // Increment consonant counter
            }
        }

        // Output the total count of vowels and consonants
        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);

        scanner.close();  // Close the Scanner object
    }
}