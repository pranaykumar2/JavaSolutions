import java.util.Scanner;

class ZPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        printZPattern(N);
    }
    public static void printZPattern(String N) {
        int len = N.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 || i == len - 1) {
                    System.out.print(N.charAt(j) + " ");
                } else {
                    if (j == len - i - 1) {
                        System.out.print(N.charAt(j) + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

}