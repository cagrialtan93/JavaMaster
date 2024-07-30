public class LoopPractice {
    public static void main(String[] args) {
        System.out.println(isPrime(7) ? "is prime" : "is not prime");
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int i = 2; i <= number / 2; i++) {
            System.out.println(number + " " + i);
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean countPrimeUntilThree(int range){
        for (int i = 0; i < range; i++) {
               
        }
    }
}
