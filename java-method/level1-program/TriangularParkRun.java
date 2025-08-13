import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds to complete 5km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 kilometers in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the three sides of the triangle in meters
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Check if the sides form a valid triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
            (side1 + side2 <= side3) ||
            (side1 + side3 <= side2) ||
            (side2 + side3 <= side1)) {
            System.out.println("Invalid triangle sides entered.");
            return;
        }

        // Calculate number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Output the result
        System.out.printf("The athlete must complete %.2f rounds to run 5 kilometers.\n", rounds);
    }
}
