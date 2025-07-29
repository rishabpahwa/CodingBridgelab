import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus is INR " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
}
