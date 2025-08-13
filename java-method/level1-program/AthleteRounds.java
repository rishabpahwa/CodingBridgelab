import java.util.Scanner;

public class AthleteRounds {

    // Method to compute number of rounds for 5 km run
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Perimeter in meters
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get sides of the triangle from user
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double s3 = sc.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(s1, s2, s3);

        // Display result
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");
    }
}

