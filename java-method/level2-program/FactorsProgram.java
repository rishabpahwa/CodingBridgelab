import java.util.Scanner;

public class FactorsProgram {

    // Method to find and return factors as an array
    static int[] getFactors(int num) {
        int count = 0;

        // First loop: find count of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array of exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    static int sumOfSquares(int[] factors) {
        int sumSq = 0;
        for (int factor : factors) {
            sumSq += Math.pow(factor, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get factors
        int[] factors = getFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
    }
}
