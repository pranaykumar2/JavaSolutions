import java.math.BigInteger;
import java.util.Scanner;

public class SelfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        selfPowers(range);
    }

    public static void selfPowers(int range) {
        BigInteger sum = BigInteger.ZERO;
        for(long i = 1; i <= range; i++) {
            BigInteger num = BigInteger.valueOf(i);
            sum = sum.add(num.pow((int) i));
        }
        String result = sum.toString();
        System.out.print(result.substring(result.length() - 10));
    }
}
