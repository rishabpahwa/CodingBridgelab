import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (true) {
            double num = input.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total sum is " + total);
    }
}
