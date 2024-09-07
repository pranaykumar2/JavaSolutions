import java.math.BigInteger;
import java.util.Scanner;

public class ThousandDigitFibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digits = input.nextInt();
        int index = thousandDigitFibonacciNumber(digits);
        System.out.println(index);
    }

    public static int thousandDigitFibonacciNumber(int digits) {
        if (digits <= 0) {
            return -1;
        }

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        int term = 2;

        while (b.toString().length() < digits) {
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
            term++;
        }

        return term;
    }
}