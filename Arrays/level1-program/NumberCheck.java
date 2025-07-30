import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is a positive even number.");
                else
                    System.out.println(num + " is a positive odd number.");
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal.");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last.");
        else
            System.out.println("First element is less than last.");
    }
}
