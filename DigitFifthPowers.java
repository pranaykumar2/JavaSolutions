import java.lang.Math;
public class DigitFifthPowers {
    public static void main(String[] args) {
        digitFifthPowers();
    }
    public static void digitFifthPowers() {
        int sum = 0, num = 0;
        for (int i = 2; i < 354294; i++) {
            int temp = i;
            while (temp > 0) {
                num += (int) Math.pow(temp % 10, 5);
                temp /= 10;
            }
            if(num == i) {
                sum += i;
            }
            num = 0;
        }
        System.out.println(sum);
    }
}
