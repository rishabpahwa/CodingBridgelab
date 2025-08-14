import java.util.Scanner;

class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        try {


            System.out.print("Enter an integer: ");


            int num = Integer.parseInt(sc.nextLine());


            System.out.println("Half of number: " + (num / 2));


        } catch (NumberFormatException | ArithmeticException e) {


            System.out.println("Error: " + e.getMessage());

        }
    }


}