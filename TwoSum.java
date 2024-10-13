import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        twoSum(arr, target);
    }

    public static void twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] == diff) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
