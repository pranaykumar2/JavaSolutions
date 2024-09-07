import java.util.Scanner;

public class StringScoringWithPalindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        int num = stringScoringWithPalindromes(str);
        System.out.println(num);
    }

    public static int stringScoringWithPalindromes(String str) {
        int score = 0;
        for (int i = 0; i <= str.length() - 5; i++) {
            if (isPalindrome(str.substring(i, i + 5))) {
                score += 10;
            }
        }
        for (int i = 0; i <= str.length() - 4; i++) {
            if (isPalindrome(str.substring(i, i + 4))) {
                score += 5;
            }
        }
        return score;
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}