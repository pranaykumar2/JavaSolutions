import java.util.Scanner;

public class AlternateDigits {

    /*
    * Give a number you have to print its alternate digits
    * for eg1: 02157 => 0 1 7
    *     eg2: 1734 => 1 3
    * */

    public static void main(String[] args) {
        printAlternateDigits();
    }

    public static void printAlternateDigits() {
        Scanner input = new Scanner(System.in);
        String number = input.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i += 2) {
            result.append(number.charAt(i)).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}