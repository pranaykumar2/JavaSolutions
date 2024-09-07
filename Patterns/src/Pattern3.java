import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        printPattern(N);
    }

    static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                char c = (char) (j + 64);
                System.out.print(c + " ");
            }
            for (int j = 1; j < i; j++) {
                char c = (char) (j + 64);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
