package JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;
import java.util.Arrays;

public class DiagonalDifference_ex_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int row = 0;
        int col = 0;
        int sumFirstDiagonal = 0;
        while (row < n && col < n) {
            sumFirstDiagonal += matrix[row++][col++];
        }

        row = n - 1;
        col = 0;
        int sumSecondDiagonal = 0;
        while (row >= 0 && col < n) {
            sumSecondDiagonal += matrix[row--][col++];
        }
        int result = Math.abs(sumFirstDiagonal - sumSecondDiagonal);
        System.out.println(result);
    }
}

