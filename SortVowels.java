import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortVowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();

        System.out.println(new String(sortVowels(arr)));
    }

    public static char[] sortVowels(char[] arr) {
        ArrayList<Character> vowels = new ArrayList<>();
        for (char c : arr) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        int vowelIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = vowels.get(vowelIndex++);
            }
        }
        return arr;
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}