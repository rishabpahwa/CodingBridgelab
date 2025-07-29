import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += i;

            int formulaSum = n * (n + 1) / 2;
            System.out.println("Loop Sum = " + sum + ", Formula Sum = " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
