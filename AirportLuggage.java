import java.util.Arrays;

public class AirportLuggage {
    public static int[] solve(int N, int K) {
        int[] slots = new int[K];
        int bagCount = 1;
        int i = 0;

        // Distribute bags
        while (N > 0) {
            // Number of bags to place in the current slot
            int toPlace = Math.min(bagCount, N);
            slots[i] += toPlace;
            N -= toPlace;

            // Move to the next slot
            i = (i + 1) % K;

            // Increment the number of bags for the next cycle
            if (i == 0) {
                bagCount += K;
            }
        }

        return slots;
    }

    public static void main(String[] args) {
        // Example usage
        int N = 29; // Total bags
        int K = 4;  // Number of slots
        int[] result = solve(N, K);
        System.out.println(Arrays.toString(result));
    }
}