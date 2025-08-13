import java.util.Arrays;

public class RandomStats {
    
    // Method to generate an array of random 4-digit numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000); // 1000–9999
        }
        return arr;
    }
    
    // Method to find average, min, and max
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }

    // Main method
    public static void main(String[] args) {
        RandomStats rs = new RandomStats();
        
        int[] numbers = rs.generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        
        double[] results = rs.findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}

