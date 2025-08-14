import java.util.Scanner;

public class CharFrequencyMainOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Step 1: Array to store frequency (256 ASCII characters)
        int[] freq = new int[256];

        // Step 2: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 3: Store characters & their frequencies in a 2D array
        // Max possible unique characters = text length
        char[][] charFreq = new char[text.length()][2]; 
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) { // only if not already printed
                charFreq[index][0] = ch;
                charFreq[index][1] = (char) freq[ch]; // store frequency as char (not ideal for big numbers)
                index++;
                freq[ch] = 0; // mark as processed
            }
        }

        // Step 4: Display results
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < index; i++) {
            System.out.println("'" + charFreq[i][0] + "' : " + (int) charFreq[i][1]);
        }

        sc.close();
    }
}