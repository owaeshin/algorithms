package ru.owaeshin.binarys;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 1;
        matrix[0][1] = 3;
        matrix[0][2] = 5;
        matrix[0][3] = 7;
        matrix[1][0] = 10;
        matrix[1][1] = 11;
        matrix[1][2] = 16;
        matrix[1][3] = 20;
        matrix[2][0] = 23;
        matrix[2][1] = 30;
        matrix[2][2] = 34;
        matrix[2][3] = 60;
        System.out.println(new SearchMatrix().searchMatrix(matrix, 3));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 10));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 20));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 60));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 1));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 0));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 62));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            if (row[0] > target) {
                col = i > 0 ? i - 1 : i;
                break;
            }
        }
        int[] row = matrix[col];
        for (int j : row) {
            if (j > target) {
                return false;
            } else if (j == target) {
                return true;
            }
        }
        return false;
    }
}
