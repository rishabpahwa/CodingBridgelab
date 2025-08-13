import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Number of students cannot be negative.");
        } else {
            int handshakes = calculateHandshakes(n);
            System.out.println("Maximum number of handshakes possible among " + n + " students is: " + handshakes);
        }
    }
}

