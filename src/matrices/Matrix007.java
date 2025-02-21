package matrices;

import java.util.Scanner;

public class Matrix007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int n = sc.nextInt();
        System.out.print("Enter matrix row :");
        int row = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        } for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("***************\t");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[row][j] + " \t");
            }
            break;
        }
    }
}
