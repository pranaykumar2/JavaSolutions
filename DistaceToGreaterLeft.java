import java.util.Scanner;

public class DistaceToGreaterLeft {

    //arr[] = {2, 3, 1, 4, 5, 6, 7, 8}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int index = input.nextInt();
        int value = distanceToGreaterLeft(arr, index);
        System.out.println(value);
    }

    public static int distanceToGreaterLeft(int[] arr, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] > arr[index]) {
                return index - i;
            }
        }
        return -1;
    }
}
