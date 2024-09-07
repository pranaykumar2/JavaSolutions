import java.util.*;

public class MexNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int I = input.nextInt();
        int[] A = new int[I];
        for (int i = 0; i < I; i++) {
            A[i] = input.nextInt();
        }
        System.out.println(minElementsToRemove(A));
    }

    public static int minElementsToRemove(int[] A) {
        int originalMex = calculateMex(A);
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }

        int minRemovals = 0;
        for (int i = 0; i <= originalMex; i++) {
            if (set.contains(i)) {
                set.remove(i);
                minRemovals++;
                if (calculateMex(set) != originalMex) {
                    return minRemovals;
                }
            }
        }

        return -2;
    }

    public static int calculateMex(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }
        return calculateMex(set);
    }

    public static int calculateMex(Set<Integer> set) {
        int mex = 0;
        while (set.contains(mex)) {
            mex++;
        }
        return mex;
    }
}