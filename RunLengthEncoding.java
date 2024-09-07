import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(encode(str));
    }

    public static String encode(String str) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                encoded.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return encoded.toString();
    }
}