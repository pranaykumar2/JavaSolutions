import java.util.Scanner;

public class PrintPrimes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N < 2 || N > 1000) {
            System.out.println("N must be between 2 and 1000.");
            return;
        }
        printPrimes(N);
    }

    public static void printPrimes(int N) {
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        if (count > 0) {
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}