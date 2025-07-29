import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();
        int day = new Scanner(System.in).nextInt();
        boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}
