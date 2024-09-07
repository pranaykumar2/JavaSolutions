import java.util.Scanner;

public class DoubleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        doubleCharacter(str);
    }
    public static void doubleCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
