import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare start and end characters iteratively
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[index++] = text.charAt(i);
        }
        return reversed;
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase for accurate palindrome check
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Logic 1
        boolean result1 = isPalindromeIterative(cleanInput);

        // Logic 2
        boolean result2 = isPalindromeRecursive(cleanInput, 0, cleanInput.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeUsingArrays(cleanInput);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Arrays): " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}