import java.math.BigInteger;

public class FactorialDigitSum {
    /*
    * n! means n  (n - 1)  ...  3  2  1.
    * For example, 10! = 10  9  ...  3  2  1 = 3628800,
    * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
    * Find the sum of the digits in the number 100!.
    */
    public static void main(String[] args) {
        BigInteger num = factorial(100);
        BigInteger sum = factorialDigitSum(num);
        System.out.println(sum);
    }

    public static BigInteger factorial(int n) {
        BigInteger num = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }

    public static BigInteger factorialDigitSum(BigInteger number) {
        String numStr = number.toString();
        BigInteger sum = BigInteger.ZERO;
        for (char digit : numStr.toCharArray()) {
            sum = sum.add(BigInteger.valueOf(Character.getNumericValue(digit)));
        }
        return sum;
    }
}
