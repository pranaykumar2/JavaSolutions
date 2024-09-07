
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        printPattern(N);
    }

    static void printPattern(int N) {
        while (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            N -= 1;
        }
    }
}

