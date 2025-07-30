import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0, temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int i = 0;
        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int j = 0; j < digits.length; j++) {
            System.out.print(digits[j]);
        }
    }
}
