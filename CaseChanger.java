import java.util.Scanner;

public class CaseChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(caseChanger(str));
    }

    public static String caseChanger(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                sb.append(word.toUpperCase()).append(" ");
            } else {
                sb.append(word.toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}