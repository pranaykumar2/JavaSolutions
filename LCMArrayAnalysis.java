import java.util.Scanner;
import java.lang.Math;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLcm = maxLcmOfAdjacentElements(arr);
        System.out.print(maxLcm);
    }

    public static int maxLcmOfAdjacentElements(int[] arr) {
        int maxLcm = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = lcm(arr[i], arr[i + 1]);
            maxLcm = Math.max(maxLcm, arr[i]);
        }
        return maxLcm;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}