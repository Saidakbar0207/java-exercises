package forloop;

import java.util.Scanner;

public class For40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            for(int j=1;j<=i-a+1;j++){
                System.out.print(i+" ");
            }
        }
    }
}
