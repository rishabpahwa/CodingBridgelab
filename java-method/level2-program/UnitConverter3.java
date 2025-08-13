public class UnitConverter3 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100°F = " + fahrenheitToCelsius(100) + "°C");
        System.out.println("0°C = " + celsiusToFahrenheit(0) + "°F");
        System.out.println("150 pounds = " + poundsToKilograms(150) + " kg");
        System.out.println("68 kg = " + kilogramsToPounds(68) + " pounds");
        System.out.println("5 gallons = " + gallonsToLiters(5) + " liters");
        System.out.println("20 liters = " + litersToGallons(20) + " gallons");
    }
}
