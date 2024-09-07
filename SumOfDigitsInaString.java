import java.util.Scanner;

public class SumOfDigitsInaString {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(sumOfDigits(str));
    }
    static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }
}
