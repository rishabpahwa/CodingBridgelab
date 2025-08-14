import java.util.*;

class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = "";
        for (int i = start; i < end && i < text.length(); i++) {
            sub1 += text.charAt(i);
        }

        String sub2 = text.substring(start, end);

        boolean same = true;
        if (sub1.length() != sub2.length()) same = false;
        else {
            for (int i = 0; i < sub1.length(); i++) {
                if (sub1.charAt(i) != sub2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Strings match? " + same);
    }
}