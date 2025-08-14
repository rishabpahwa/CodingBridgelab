import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII character frequency array

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++; // ASCII value as index
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch; // First non-repeating found
            }
        }

        return '\0'; // If no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeating(input);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}