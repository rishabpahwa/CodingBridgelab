import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;     // Division
        int remainder = number % divisor;    // Modulus
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check for divide-by-zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return;
        }

        // Get remainder and quotient
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display results
        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);
    }
}
