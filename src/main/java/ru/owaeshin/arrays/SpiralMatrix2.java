package ru.owaeshin.arrays;

import java.util.Arrays;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int counter = 1;
        while (counter <= n * n) {
            for (int i = colStart; i < colEnd + 1; i++) {
                matrix[rowStart][i] = counter++;
            }
            rowStart++;
            for (int i = rowStart; i < rowEnd + 1; i++) {
                matrix[i][colEnd] = counter++;
            }
            colEnd--;
            for (int i = colEnd; i > colStart - 1; i--) {
                matrix[rowEnd][i] = counter++;
            }
            rowEnd--;
            for (int i = rowEnd; i > rowStart - 1; i--) {
                matrix[i][colStart] = counter++;
            }
            colStart++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new SpiralMatrix2().generateMatrix(3)));
    }
}
