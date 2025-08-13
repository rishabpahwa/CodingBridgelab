import java.util.Scanner;

class LineCalculatorSmple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Euclidean distance
        double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Euclidean distance: " + distance);

        // Equation of the line
        if (x1 == x2) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            double slope = (y2 - y1) / (x2 - x1);
            double intercept = y1 - slope * x1;
            System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
        }

        sc.close();
    }
}
