import java.util.*;
public class SumSquareDifference {
    /*
    * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    * */
    public static void main(String[] args) {
        int num = sumSquareDifference(100);
        System.out.println(num);
    }

    public static int sumSquareDifference(int n) {
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        int squareOfSum = (int) Math.pow(n * (n + 1) / 2, 2);
        return Math.abs(sumOfSquares - squareOfSum);
    }
}
