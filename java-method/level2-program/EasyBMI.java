import java.util.Scanner;

public class EasyBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 0: weight, 1: height(cm), 2: BMI
        String[] status = new String[10];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            // Convert cm to meters
            double heightMeters = data[i][1] / 100;

            // Calculate BMI
            data[i][2] = data[i][0] / (heightMeters * heightMeters);

            // Determine BMI status
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] < 25) {
                status[i] = "Normal";
            } else if (data[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
