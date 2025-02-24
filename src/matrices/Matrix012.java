package matrices;

import java.util.Scanner;

public class Matrix012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            if(j%2==0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else {
                for (int i =m-1; i >=0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
