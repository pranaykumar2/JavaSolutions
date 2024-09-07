import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        printPattern(N);
    }

    static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
