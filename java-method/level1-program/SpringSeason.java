public class SpringSeason {

    // Method to check if given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring: March 20 to June 20
        return (month == 3 && day >= 20 && day <= 31) || // March 20 - 31
               (month == 4 && day >= 1 && day <= 30)  || // April
               (month == 5 && day >= 1 && day <= 31)  || // May
               (month == 6 && day >= 1 && day <= 20);    // June 1 - 20
    }

    public static void main(String[] args) {
        // Check if correct number of arguments provided
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Convert command line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and print result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
