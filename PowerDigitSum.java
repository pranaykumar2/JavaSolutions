import java.math.BigInteger;

public class PowerDigitSum {
    /*
     * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * What is the sum of the digits of the number 2^1000?
     * */
    public static void main(String[] args) {
        powerDigitSum(2, 1000);
    }

    public static void powerDigitSum(int base, int power) {
        BigInteger num = BigInteger.valueOf(base).pow(power);
        String numStr = num.toString();
        long sum = 0;
        for (char digit : numStr.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        System.out.println(sum);
    }
}