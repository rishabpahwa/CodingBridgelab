import java.util.Scanner;

class NumberChecker3 {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is prime? " + isPrime(number));
        System.out.println("Is neon? " + isNeon(number));
        System.out.println("Is spy? " + isSpy(number));
        System.out.println("Is automorphic? " + isAutomorphic(number));
        System.out.println("Is buzz? " + isBuzz(number));

        sc.close();
    }
}
