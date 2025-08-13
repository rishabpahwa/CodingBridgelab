import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent}; // Return as array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get angle from user
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Get results
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}

