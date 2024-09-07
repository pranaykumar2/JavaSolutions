import java.util.*;

class UpdateTotalLengthOfArray {

    /*
     * Given an array arr[] = {1, 2, 3, 4, 4, 5, 6, 6}
     * if arr[i] % 2 = 0 then you have to remove the element
     * if arr[i] contains the duplicates then you have to remove the value
     * by keeping the arr[] with distinct elements and finally return the total length of updated length of arr[]
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        Integer[] arrObj = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        List<Integer> uniqueOdds = Arrays.stream(arrObj)
                .filter(n -> n % 2 != 0)
                .distinct()
                .toList();

        int totalLength = uniqueOdds.size();
        System.out.println(totalLength);

        System.out.print("\nUpdated Array: ");
        uniqueOdds.forEach(element -> System.out.print(element + " "));
    }
}
