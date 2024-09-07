import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int SmallestNumber = findFourDigitNumber(number);
        System.out.println(SmallestNumber);
    }

    public static int findFourDigitNumber(int number) {
        int i, temp;
        for (i = 1000; i <= 9999; i++) {
            temp = i;
            boolean isNumber = hasDistinctDigits(temp);
            if (isNumber && number < i) {
                return i;
            }
        }
        return 0;
    }

    public static boolean hasDistinctDigits(int num) {
        int[] digits = new int[4];
        int index = 0;
        while(num > 0) {
            digits[index] = num % 10;
            num /= 10;
            index++;
        }
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if(digits[i] == digits[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}