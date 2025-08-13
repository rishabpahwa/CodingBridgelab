import java.util.*;

public class NumberCheckerEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get digits
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }

        // Count digits
        int count = digits.length;
        System.out.println("Count of digits: " + count);

        // Sum and sum of squares
        int sum = 0, sumSq = 0;
        for (int d : digits) {
            sum += d;
            sumSq += Math.pow(d, 2);
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares: " + sumSq);

        // Harshad check
        if (num % sum == 0)
            System.out.println("Harshad Number: Yes");
        else
            System.out.println("Harshad Number: No");

        // Frequency
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " → " + freq[i][1] + " times");
            }
        }
    }
}
