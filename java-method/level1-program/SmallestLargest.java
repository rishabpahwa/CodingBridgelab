import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Find smallest
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        // Find largest
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        // Return as array [smallest, largest]
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Get smallest and largest
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}

