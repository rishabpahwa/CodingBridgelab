import java.util.Arrays;

class OTPGeneratorSimple {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // 100000 to 999999
    }

    // Method to check if the new OTP already exists in the array
    public static boolean exists(int[] arr, int count, int otp) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == otp) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        int count = 0;

        // Generate 10 unique OTPs
        while (count < 10) {
            int otp = generateOTP();
            if (!exists(otps, count, otp)) {
                otps[count] = otp;
                count++;
            }
        }

        // Display OTPs
        System.out.println("Generated 10 unique OTPs: " + Arrays.toString(otps));
    }
}
