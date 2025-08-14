import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String text1, String text2) {
        // Step 1: If lengths are different, not an anagram
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Count frequency for text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Step 4: Count frequency for text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Step 5: Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true; // If all frequencies match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Remove spaces and convert to lowercase for accurate check
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check and display result
        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
