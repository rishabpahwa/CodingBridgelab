import java.util.*;

class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // Without handling
        // int num = Integer.parseInt(text);
        // System.out.println(num);

        // With handling
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }
}