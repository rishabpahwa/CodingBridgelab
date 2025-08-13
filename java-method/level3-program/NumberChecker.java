import java.util.*;

public class NumberChecker {

    // Count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    // Check Duck number (has zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Check Armstrong number
    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0, n = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Find largest and second largest
    public static int[] largestTwo(int[] digits) {
        Arrays.sort(digits);
        return new int[]{digits[digits.length - 1], digits[digits.length - 2]};
    }

    // Find smallest and second smallest
    public static int[] smallestTwo(int[] digits) {
        Arrays.sort(digits);
        return new int[]{digits[0], digits[1]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Duck number? " + isDuck(digits));
        System.out.println("Armstrong number? " + isArmstrong(num, digits));

        int[] large = largestTwo(digits.clone());
        System.out.println("Largest: " + large[0] + ", Second Largest: " + large[1]);

        int[] small = smallestTwo(digits.clone());
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);
    }
}
