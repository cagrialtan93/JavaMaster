public class Main {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double mile = kilometersPerHour / 1.609;
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long roundedValue = Math.round(mile);
            return roundedValue;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h");
        }
    }
}