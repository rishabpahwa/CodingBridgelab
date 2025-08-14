import java.util.Scanner;

public class CharFrequencyWithUnique {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if it appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of unique characters
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // For ASCII characters

        // Step 1: Count frequency of all characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 3: Create 2D String array to store char and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get frequency data
        String[][] freqData = findCharFrequency(input);

        // Display table
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (String[] row : freqData) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }

        sc.close();
    }
}
