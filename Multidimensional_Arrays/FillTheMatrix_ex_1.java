package JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix_ex_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix;

        if (pattern.equals("A")) {
            matrix = getMatrixPatternA(n);
        } else {
            matrix = getMatrixPatternB(n);
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMatrixPatternA(int size) {
        int[][] matrix = new int[size][size];
        int value = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = value;
                value++;
            }
        }
        return matrix;
    }

    public static int[][] getMatrixPatternB(int size) {
        int[][] matrix = new int[size][size];
        int value = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }
        return matrix;
    }
}

