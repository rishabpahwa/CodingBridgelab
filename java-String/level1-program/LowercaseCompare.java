import java.util.*;

class LowercaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String custom = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
            custom += c;
        }

        String builtIn = text.toLowerCase();

        boolean same = true;
        if (custom.length() != builtIn.length()) same = false;
        else {
            for (int i = 0; i < custom.length(); i++) {
                if (custom.charAt(i) != builtIn.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Custom lowercase: " + custom);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Match? " + same);
    }
}