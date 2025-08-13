import java.util.Scanner;

class CollinearPoints {

    // Method to check collinearity using slopes
    public static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // slope AB
        double slopeAB = (y2 - y1) / (x2 - x1);
        // slope BC
        double slopeBC = (y3 - y2) / (x3 - x2);
        // slope AC
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check collinearity using area of triangle
    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check collinearity using slopes
        if (x2 - x1 != 0 && x3 - x2 != 0 && x3 - x1 != 0) {
            if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
                System.out.println("The points are collinear (using slope method).");
            } else {
                System.out.println("The points are NOT collinear (using slope method).");
            }
        } else {
            System.out.println("Slope method cannot be used due to vertical line(s).");
        }

        // Check collinearity using area
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (using area method).");
        } else {
            System.out.println("The points are NOT collinear (using area method).");
        }

        sc.close();
    }
}
