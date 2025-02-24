package matrices;

import java.util.Scanner;

public class Matrix011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else {
                for (int j =m-1; j >=0; j--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            System.out.println();
        }
    }
}
