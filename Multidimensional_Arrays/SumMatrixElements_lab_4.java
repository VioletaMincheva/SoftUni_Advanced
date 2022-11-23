package JavaAdvanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_lab_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols, scanner);
        int sum = sumMatrixElements(matrix);
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

    private static int sumMatrixElements(int[][] matrix) {
        int sumElements = 0;
        for (int currentRow = 0; currentRow < matrix.length; currentRow++) {
            for (int currentCol = 0; currentCol < matrix[currentRow].length; currentCol++) {
                sumElements += matrix[currentRow][currentCol];
            }
        }
        return sumElements;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
