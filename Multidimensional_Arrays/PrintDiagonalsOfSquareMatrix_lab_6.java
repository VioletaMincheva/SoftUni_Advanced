package JavaAdvanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_lab_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int matrix[][] = readMatrix(scanner, n);

        int row = 0;
        int col = 0;
        while (row < n && col < n) {
            System.out.print(matrix[row++][col++] + " ");
        }
        System.out.println();

        row = n - 1;
        col = 0;
        while (row >= 0 && col < n) {
            System.out.print(matrix[row--][col++] + " ");
        }

    }
    public static int[][] readMatrix(Scanner scanner, int n) {
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
