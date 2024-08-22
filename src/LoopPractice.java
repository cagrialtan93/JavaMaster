import com.sun.source.tree.BreakTree;

public class LoopPractice {
    public static void main(String[] args) {
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int i = 2; i <= number / 2; i++) {
            System.out.println(number + " " + i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void countPrimeUntilThree() {
        int total = 0;
        int totalCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
                totalCount++;
                System.out.println(i);
            }
            if (totalCount == 5) {
                break;
            }
        }
    }

    // Great solution compared to mine!
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
//        if (number < 0){
//            return false;
//        } else {
//            if (number % 2 != 0){
//                return true;
//            }
//            return false;
//        }
    }

    public static int sumOdd(int start, int end) {
        int total = 0;
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }

        return total;
    }

    public static boolean isEvenNumber(int number) {
        return number > 0 && number % 2 == 0;
    }

    public static void checkEvenNumbersInRange() {
        int i = 6;
        while (i > 5 && i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static int sumDigits(int number) {
        int total = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            total += number % 10;
            number = number / 10;
        }
        total += number;
        return total;
    }

    public static boolean isPalindrome(int number) {
        int hold = number;
        int oppositeOfNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            oppositeOfNumber = (oppositeOfNumber * 10) + digit;
            number /= 10;
        }

        return oppositeOfNumber == hold;
    }

    // to find the first digit divide with 10 until there is one digit left
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;

//        int exponentVersion = (int) Math.pow(10, String.valueOf(Math.abs(number)).length() - 1);
//        int sumOfDigits = 0;
//        if (number < 0){
//            return -1;
//        }
//        else if (number < 10 && number >= 0) {
//            sumOfDigits = number * 2;
//        } else {
//            sumOfDigits = number / exponentVersion + number % 10;
//        }
//
//        return sumOfDigits;
    }

    public static int getEvenDigitSum(int number) {
        int evenTotal = 0;
        if (number < 0) {
            return -1;
        }

        while (number >= 10) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenTotal += digit;
            }
            number = number / 10;
        }

        if (number % 2 == 0) evenTotal += number;

        return evenTotal;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(" " + i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestDivisor = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }

        return greatestDivisor;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return total == number;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        number = reverse(number);

        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;

            switch (lastDigit) {
                case 0 -> System.out.print("Zero");
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Nine");
            }
            System.out.print(" ");

        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(Math.abs(number)).length();
    }

    public static int reverse(int number) {
        int reversedVersion = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedVersion = (reversedVersion * 10) + digit;
            number /= 10;
        }

        if (reversedVersion != number) {
            reversedVersion *= 10;
        }

        return reversedVersion;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int fiveKilosAmount = bigCount * 5;
        int amountNeeded = goal - fiveKilosAmount;

        if (fiveKilosAmount > goal) {
            return goal % 5 == 0 || (smallCount >= goal % 5);
        }

        if (smallCount >= amountNeeded) {
            return true;
        } else {
            return false;
        }
    }
}

