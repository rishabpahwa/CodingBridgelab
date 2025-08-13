import java.util.Scanner;

class StudentScorecard {

    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3]; // Column 0 = Physics, 1 = Chemistry, 2 = Maths
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = (int)(Math.random() * 100); // Physics marks 0-99
            marks[i][1] = (int)(Math.random() * 100); // Chemistry marks 0-99
            marks[i][2] = (int)(Math.random() * 100); // Maths marks 0-99
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] result = new double[numStudents][3]; // Column 0=Total, 1=Average, 2=Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t"); // Student number
            System.out.print(marks[i][0] + "\t");
            System.out.print(marks[i][1] + "\t\t");
            System.out.print(marks[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t"); // Total
            System.out.print(results[i][1] + "\t"); // Average
            System.out.print(results[i][2] + "\n"); // Percentage
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generateMarks(numStudents);
        double[][] results = calculateScores(marks);

        displayScorecard(marks, results);

        sc.close();
    }
}

