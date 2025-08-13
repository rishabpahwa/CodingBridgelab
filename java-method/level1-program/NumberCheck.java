import java.util.Scanner;

public class NumberCheck {

    // Method to return -1 for negative, 1 for positive, and 0 for zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // Positive
        } else if (num < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Directly print the method result
        System.out.println(checkNumber(number));
    }
}
