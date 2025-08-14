import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] hwData) {
        String[][] result = new String[hwData.length][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < hwData.length; i++) {
            double weight = hwData[i][0];
            double heightCm = hwData[i][1];
            double heightM = heightCm / 100; // convert cm to meters

            double bmi = weight / (heightM * heightM);

            // Determine status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store as String
            result[i][0] = String.format("%.1f", heightCm); // height in cm
            result[i][1] = String.format("%.1f", weight);   // weight in kg
            result[i][2] = String.format("%.2f", bmi);      // BMI with 2 decimals
            result[i][3] = status;
        }
        return result;
    }

    // Method to display in table format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hwData = new double[10][2]; // [rows][0=weight,1=height]

        // Take user input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hwData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hwData[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = calculateBMI(hwData);

        // Display table
        displayTable(bmiData);

        sc.close();
    }
}