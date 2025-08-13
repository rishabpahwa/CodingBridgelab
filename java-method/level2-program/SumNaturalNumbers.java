import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find sum of first n natural numbers
    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula method to find sum of first n natural numbers
    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if natural number
        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting...");
            return;
        }

        // Compute sums
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);

        // Compare results
        if (sumRec == sumForm) {
            System.out.println("✅ Both methods give the same result. Computation is correct!");
        } else {
            System.out.println("❌ Results do not match. Check the code.");
        }
    }
}
