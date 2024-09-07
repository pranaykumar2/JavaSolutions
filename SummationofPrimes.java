import java.lang.Math;
public class SummationofPrimes {
    
    /*
    * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    * Find the sum of all the primes below two million.
    */
    public static void main(String[] args) {
        long sum = summationOfPrimes(2000000);
        System.out.println(sum);
    }

    public static long summationOfPrimes(int totalPrimes) {
        long sum = 0;
        for (int i = 2; i < totalPrimes; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int checkPrime) {
        for(int i = 2; i <= Math.sqrt(checkPrime); i++) {
            if(checkPrime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
