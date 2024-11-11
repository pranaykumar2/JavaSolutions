import java.util.Arrays;

public class LeetCode2275 {
    public static int largestCombination(int[] candidates) {
        int[] count = new int[32];
        for (int candidate : candidates) {
            for (int j = 0; j < 32; j++) {
                if ((candidate & (1 << j)) != 0) {
                    count[j]++;
                }
            }
        }
        return Arrays.stream(count).max().orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 71, 62, 12, 24, 14};
        System.out.println( largestCombination(arr));
    }
}