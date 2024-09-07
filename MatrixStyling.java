import java.util.Arrays;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[][] mat = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        styleMatrix(mat);
        printResult(m, mat);
    }

    public static void styleMatrix(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                Arrays.sort(matrix[i]);
            } else {
                Arrays.sort(matrix[i]);
                reverseArray(matrix[i]);
            }
        }

        for (int j = 0; j < size; j++) {
            int[] column = new int[size];
            for (int i = 0; i < size; i++) {
                column[i] = matrix[i][j];
            }
            Arrays.sort(column);
            if (j % 2 == 0) {
                reverseArray(column);
            }
            for (int i = 0; i < size; i++) {
                matrix[i][j] = column[i];
            }
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void printResult(int M, int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}