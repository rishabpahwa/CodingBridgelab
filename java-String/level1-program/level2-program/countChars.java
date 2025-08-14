import java.util.Scanner;

class Main {
    public static void countChars(String str) {
        int vowels = 0, consonants = 0, digits = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (ch >= 'a' && ch <= 'z') consonants++;
            else if (ch >= '0' && ch <= '9') digits++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        countChars(s);
    }
}