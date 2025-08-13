public class UnitConverter {

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 km = " + kmToMiles(10) + " miles");
        System.out.println("5 miles = " + milesToKm(5) + " km");
        System.out.println("3 meters = " + metersToFeet(3) + " feet");
        System.out.println("15 feet = " + feetToMeters(15) + " meters");
    }
}

