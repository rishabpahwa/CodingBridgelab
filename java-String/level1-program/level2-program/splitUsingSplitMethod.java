import java.util.Scanner;

class Main {
    public static void splitUsingSplitMethod(String str) {
        String[] words = str.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        splitUsingSplitMethod(s);
    }
}