import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            data[i][0] = sc.nextLine();
            System.out.print("Enter phone number: ");
            data[i][1] = sc.nextLine();
        }

        System.out.println("\nName\t\tPhone Number");
        for (int i = 0; i < 3; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}