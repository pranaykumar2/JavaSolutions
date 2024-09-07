import java.util.Scanner;
import java.math.BigInteger;

public class Count1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger number = input.nextBigInteger();
        int count = count1s(number);
        System.out.println(count);
    }

    public static int count1s(BigInteger number) {
        int count = 0;
        BigInteger ten = BigInteger.TEN;
        BigInteger one = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;

        while (number.compareTo(zero) > 0) {
            BigInteger temp = number.mod(ten);
            if (temp.equals(one)) {
                count += 1;
            }
            number = number.divide(ten);
        }
        return count;
    }
}