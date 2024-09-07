import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        spiralMatrix(matrix);
    }

    public static void spiralMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i]).append(" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(" ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }
        System.out.println(result.toString().trim());
    }
}