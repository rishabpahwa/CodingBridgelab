import java.util.*;

class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean same = true;
        if (s1.length() != s2.length()) {
            same = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Using charAt comparison: " + same);
        System.out.println("Using equals() method: " + s1.equals(s2));
        System.out.println("Both results same? " + (same == s1.equals(s2)));
    }
}