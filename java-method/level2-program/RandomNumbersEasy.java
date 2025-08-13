import java.util.Arrays;

public class RandomNumbersEasy {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int min, max, sum = 0;

        // Generate 5 random 4-digit numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        // Print numbers
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // Initialize min and max
        min = numbers[0];
        max = numbers[0];

        // Find sum, min, max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display results
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
