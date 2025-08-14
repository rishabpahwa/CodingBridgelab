import java.util.Scanner;

class Main {
    public static void splitWordsUsingCharAt(String str) {
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                System.out.println(word);
                word = "";
            } else {
                word += ch;
            }
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        splitWordsUsingCharAt(s);
    }
}
