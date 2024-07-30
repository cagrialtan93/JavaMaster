public class Main {
    public static void main(String[] args) {
        char natoChar = 'C';
        switch (natoChar) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Please use a valid character.");
                break;
        }
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

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int remainder = (kiloBytes % 1024) % 1000;
        int mb = (kiloBytes - remainder) / 1000;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainder + " KB");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isIt = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isIt = true;
                        return isIt;
                    }
                } else {
                    return isIt;
                }
            } else {
                return isIt;
            }
        } else {
            return isIt;
        }
        return isIt;
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int a, int b, int c) {
        if (isTeen(a) || isTeen(b) || isTeen(c)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        return false;
    }

    public static double convertToCentimeters(int height) {
        return 2.54 * height;
    }

    public static double convertToCentimeters(int feet, int inch) {
        int inchTotal = (feet * 12) + inch;
        return convertToCentimeters(inchTotal);
    }

    public static String getDurationString(int seconds) {
        int hour = 0, minute = 0, second = 0;
        if (seconds < 60 && seconds >= 0) {
            second = seconds;
        } else {
            minute = seconds / 60;
            hour = minute / 60;
            if (hour > 0) {
                minute = 0;
            }
            second = seconds % 60;
        }
        return hour + "h " + minute + "m " + second + "s";
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    public static void printYearsAndDays(long minutes) {
        long year = 0;
        long day = 0;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            year = minutes / 525600;
            day = minutes % 525600 / 1440;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
//        if (temperature >= 25 && temperature <= 35){
//            return true;
//        } else if (summer && (temperature >= 25 && temperature <= 45)){
//            return true;
//        } else {
//            return false;
//        }
    }
}
