package matrices;

import java.util.Scanner;

public class Matrix004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int n = sc.nextInt();
        double[] sequence= new double[n];
        System.out.print("Enter "+n+" real numbers : ");
        for (int j = 0; j < n; j++) {
            sequence[j] = sc.nextDouble();
        }
        double[][] matrix = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sequence[j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
     }
}
