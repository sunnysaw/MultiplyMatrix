/*
Question : Write a program to multiply two matrix.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix in row a column :");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrix3 = new int[row][column];
        System.out.println("Enter the element of first matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of second matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the final result :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; i < column; k++) {
                    matrix3[i][j] = matrix[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

