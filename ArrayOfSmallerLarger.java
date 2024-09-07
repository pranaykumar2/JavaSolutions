import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfSmallerLarger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        printArray(array, size);
    }

    private static void printArray(int[] array, int size) {
        int[] ascendingArray = new int[size];
        int[] descendingArray = new int[size];
        int[] arrayOfSmallLarge = new int[size];
        System.arraycopy(array, 0, ascendingArray, 0, size);
        Arrays.sort(ascendingArray);
        for (int i = 0; i < ascendingArray.length; i++) {
            descendingArray[i] = ascendingArray[ascendingArray.length - 1 - i];
        }
        int count = 0, index = 0;
        while (count < size) {
            arrayOfSmallLarge[count] = ascendingArray[index];
            count++;
            if (count == size) {
                break;
            }
            arrayOfSmallLarge[count] = descendingArray[index];
            count++;
            if (count == size) {
                break;
            }
            index++;

        }
        System.out.println("Ascending Array : "+Arrays.toString(ascendingArray));
        System.out.println("Descending Array : "+Arrays.toString(descendingArray));
        System.out.println("Final Array : "+Arrays.toString(arrayOfSmallLarge));
    }
}