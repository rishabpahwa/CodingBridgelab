import java.util.Arrays;

public class FootballTeamHeights {
    
    // Method to generate random heights for players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250
        }
        return heights;
    }
    
    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // Method to find mean height
    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }
    
    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    
    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    
    // Main method
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        
        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", findMean(heights));
    }
}
