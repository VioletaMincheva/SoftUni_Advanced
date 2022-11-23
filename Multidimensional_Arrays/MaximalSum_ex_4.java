package JavaAdvanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_ex_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, "\\s+");
        int[] bestVector = new int[2];
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[] startIndexes = new int[]{row, col};
                if (findSum(startIndexes, matrix) > bestSum) {
                    bestSum = findSum(startIndexes, matrix);
                    bestVector = startIndexes;
                }
            }
        }
        System.out.println("Sum = " + bestSum);
        printMatrix(bestVector, matrix);
    }

    private static int findSum(int[] startIndexes, int[][] matrix) {
        int sum = 0;
        for (int row = startIndexes[0]; row < startIndexes[0] + 3; row++) {
            for (int col = startIndexes[1]; col < startIndexes[1] + 3; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    public static int[][] readMatrix(Scanner scanner, String pattern) {
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(pattern))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] =
                    Arrays.stream(scanner.nextLine().split(pattern))
                            .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }


    public static void printMatrix(int[] bestVector, int[][] matrix) {

        for (int row = bestVector[0]; row < bestVector[0] + 3; row++) {
            for (int col = bestVector[1]; col < bestVector[1] + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

