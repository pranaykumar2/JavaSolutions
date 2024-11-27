import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String[] arr1str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1str).mapToInt(Integer::parseInt).toArray();

            Solution1 ob = new Solution1();
            int ans = ob.getSecondLargest(arr);

            System.out.println(ans);
            System.out.println();
        }

    }
}

class Solution1 {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}
