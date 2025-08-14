import java.util.Scanner;

public class CharFrequencyNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Step 1: Count frequency
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // initial frequency

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Step 2: Store results in String array
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        // Step 3: Trim null values
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get frequency data
        String[] frequencies = findFrequency(input);

        // Display
        System.out.println("\nCharacter Frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }

        sc.close();
    }
}
