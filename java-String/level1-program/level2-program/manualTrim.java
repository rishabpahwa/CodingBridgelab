import java.util.Scanner;

class Main {
    public static String manualTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String s = sc.nextLine();
        System.out.println("Trimmed: '" + manualTrim(s) + "'");
    }
}