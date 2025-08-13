
class ZaraBonus {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployees(int n) {
        int[][] empData = new int[n][2]; // Column 0 = salary, Column 1 = years of service
        for (int i = 0; i < n; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit salary (10000 to 99999)
            int years = (int)(Math.random() * 10) + 1; // Years of service 1 to 10
            empData[i][0] = salary;
            empData[i][1] = years;
        }
        return empData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateNewSalary(int[][] empData) {
        int n = empData.length;
        double[][] newData = new double[n][3]; // Column 0 = old salary, 1 = bonus, 2 = new salary
        for (int i = 0; i < n; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    // Method to calculate total old salary, total bonus, total new salary and display in table
    public static void displaySummary(double[][] newData) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp No | Old Salary | Bonus  | New Salary");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < newData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];
            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%6d | %10.2f | %6.2f | %10.2f%n", i + 1, oldSalary, bonus, newSalary);
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL  | %10.2f | %6.2f | %10.2f%n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployees(10);
        double[][] newSalaries = calculateNewSalary(employees);
        displaySummary(newSalaries);
    }
}
