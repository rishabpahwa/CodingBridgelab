import java.util.*;

class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // Without handling
        // System.out.println(text.substring(5, 2));

        // With handling
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }
}