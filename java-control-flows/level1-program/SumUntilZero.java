import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, num;
        do {
            num = input.nextDouble();
            total += num;
        } while (num != 0);
        System.out.println("Total sum is " + total);
    }
}
