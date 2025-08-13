import java.util.Arrays;
import java.util.Scanner;

class NumberChecker2 {

    // Count the number of digits in the number
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int n = number;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Check if the number is a duck number (has non-zero digits)
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        System.out.println("Is palindrome? " + isPalindrome(number));
        System.out.println("Is duck number? " + isDuckNumber(number));

        sc.close();
    }
}

