import java.util.Scanner;

class Main {
    public static String swapVowelCase(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                result += Character.toUpperCase(ch);
            } else if ("AEIOU".indexOf(ch) != -1) {
                result += Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Modified: " + swapVowelCase(s));
    }
}