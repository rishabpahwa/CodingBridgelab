import java.util.Scanner;

public class SumNaturalLoop {

    // Method to find sum of first n natural numbers using a loop
    static int sumUsingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for valid natural number
        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting...");
            return;
        }

        // Calculate sum using loop
        int sum = sumUsingLoop(n);

        // Display result
        System.out.println("Sum of first " + n + " natural numbers using loop = " + sum);
    }
}

