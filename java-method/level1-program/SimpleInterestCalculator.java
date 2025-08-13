import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Output
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.\n",
                interest, principal, rate, time);
    }
}
