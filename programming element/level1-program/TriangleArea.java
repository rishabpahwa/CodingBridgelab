import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        double areaInch = 0.5 * base * height;
        double areaCm = areaInch * 6.4516;

        System.out.println("The area is " + areaInch + " in² and " + areaCm + " cm²");
    }
}
