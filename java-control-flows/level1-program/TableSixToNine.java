import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
