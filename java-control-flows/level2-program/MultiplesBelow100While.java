import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (< 100): ");
        int number = sc.nextInt();

        int counter = 100;
        System.out.println("Multiples of " + number + " below 100:");
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }
}
