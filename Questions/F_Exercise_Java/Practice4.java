package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice4 {

    public void matrixAddition() {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter the number of rows and columns of the matrix");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix after addition is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Practice4 addM = new Practice4();
        addM.matrixAddition();
    }
}
