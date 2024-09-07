import java.util.Scanner;

public class Vowel2Number {
    /*
     * The Aim of the program is to replace a vowel to the number whenever it is observed in a string
     * eg: Opinion => 15p9n915n
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        vowel2Number(str);
    }

    public static void vowel2Number(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                result.append(vowelToNumber(ch));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static int vowelToNumber(char ch) {
        return switch (Character.toLowerCase(ch)) {
            case 'a' -> 1;
            case 'e' -> 5;
            case 'i' -> 9;
            case 'o' -> 15;
            case 'u' -> 21;
            default -> ch;
        };
    }
}