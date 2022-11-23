package JavaAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_lab_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);

        char[][] mixedMatrix = mixedMatrix(rows, cols, firstMatrix, secondMatrix);
        printMatrix(mixedMatrix);
    }
    public static char[][] readMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }

    public static char[][] mixedMatrix(int rows, int cols, char[][] firstMatrix, char[][] secondMatrix) {

        char[][] thirdMatrix = new char[rows][cols];
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                } else {
                    thirdMatrix[row][col] = '*';
                }
            }
        }
        return thirdMatrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
