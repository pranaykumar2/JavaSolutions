import java.util.Scanner;
import java.util.Arrays;
public class OrderCheck {
    //heights[] =        {1, 2, 1, 3, 3, 4, 3}
    //sortedHeights[] = {1, 1, 2, 3, 3, 3, 4}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] heights = new int[size];
        for(int i = 0; i < size; i++) {
            heights[i] = input.nextInt();
        }
        int changed = orderCheck(heights);
        System.out.println(changed);
    }

    public static int orderCheck(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        int total_changed = 0;

        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != sortedHeights[i]) {
                total_changed++;
            }
        }
        return total_changed;
    }
}