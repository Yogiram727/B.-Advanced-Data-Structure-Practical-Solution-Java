package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice6 {

    public void transposeMatrix() {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the element of the  matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // transpose
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the given matrix is: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practice6 tr = new Practice6();
        tr.transposeMatrix();
    }
}
