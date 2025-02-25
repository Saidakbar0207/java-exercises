package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = r.nextInt(1,10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" \t"+matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i =0; i<n; i++) {
            int min=Integer.MAX_VALUE;
            System.out.print("Matrix of row "+i+"->");
            for (int j =0; j < m; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
                System.out.print(matrix[i][j]+" ");
            }System.out.println("\nThe min element of the matrix is : "+min);

            System.out.println();
        }
    }
}
