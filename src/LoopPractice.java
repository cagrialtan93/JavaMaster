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
        if (number < 0){
            return -1;
        }
        while (number > 9) {
            total += number % 10;
            number = number / 10;
        }
        total += number;
        return total;
    }
}
