package Day3;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        /*Check if the number is less than or equal to 1:
        A prime number is always greater than 1. So, if the number is less than or equal to 1, it's not prime.*/
        if (number <= 1) {
            return false;
        }
        /*Iterate from 2 to the square root of the number:
        We only need to check divisibility up to the square root of the number.
        If a number is not divisible by any number between 2 and its square root, it's prime. */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}