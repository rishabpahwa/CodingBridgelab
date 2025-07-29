import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
    }
}
