import java.util.Scanner;

public class GreaterThanNeighbor {

    /*
    * Return the count of elements that are greater than their neighboring elements
    * eg: size: 6
    * arr[] : 1 5 3 6 9 7
    * output : 2
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int totalElements = greaterThanNeighbor(arr);
        System.out.println(totalElements);
    }

    public static int greaterThanNeighbor(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
