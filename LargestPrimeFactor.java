public class LargestPrimeFactor {
    /*
    * The prime factors of 13195 are 5, 7, 13 and 29.
    * What is the largest prime factor of the number 600851475143?
    * */
    public static void main(String[] args) {
        long num = 600851475143L;
        long largestPrimeFactor = largestPrimeFactor(num);
        System.out.println(largestPrimeFactor);
    }
    public static long largestPrimeFactor(long n) {
        long i;
        long largestPrimeFactor = 0;
        for(i = 2; i <= n; i++) {
            if(n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
                i--;
            }
        }
        return largestPrimeFactor;
    }
}
