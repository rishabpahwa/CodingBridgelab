import java.util.Scanner;

public class NumberCheckEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input and check
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare first and last
        if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than last number.");
        } else if (numbers[0] == numbers[4]) {
            System.out.println("First number is equal to last number.");
        } else {
            System.out.println("First number is less than last number.");
        }
    }
}
