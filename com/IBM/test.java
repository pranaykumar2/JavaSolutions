package com.IBM;
import java.util.*;

public class test {
    static void rightGreatestElement(int[] arr) {
        System.out.print("Next greater elements in circular array: ");

        for (int i = 0; i < arr.length; i++) {
            int nextGreater = -1;

            for (int j = 1; j < arr.length; j++) {

                int circularIndex = (i + j) % arr.length;
                if (arr[circularIndex] > arr[i]) {
                    nextGreater = arr[circularIndex];
                    break;
                }
            }

            System.out.print(nextGreater + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, ", ");
        int[] arr = new int[st.countTokens()];
        int i = 0;

        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        rightGreatestElement(arr);
        sc.close();
    }
}