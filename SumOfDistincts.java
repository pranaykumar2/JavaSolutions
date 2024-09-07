import java.util.Scanner;

public class SumOfDistincts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(sumOfDistincts(arr));
    }

    public static int sumOfDistincts(int[] arr) {
        int sum = 0;
        boolean[] visited = new boolean[1000001];
        for (int num : arr) {
            if (!visited[num]) {
                sum += num;
                visited[num] = true;
            }
        }
        return sum;
    }
}
