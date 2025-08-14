import java.util.Scanner;

class Main {
    public static int getLengthUsingCharAt(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop exit jab index out of range ho jaye
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Length of string: " + getLengthUsingCharAt(s));
    }
}