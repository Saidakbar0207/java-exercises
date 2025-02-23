package forloop;

import java.util.Scanner;

public class For29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b(a<b):");
        int b = sc.nextInt();
        System.out.print("Enter number n :");
        int n = sc.nextInt();
        int h=(b-a)/n;
        for(int i=0;i<=n;i++){
            int temp=a;
            System.out.print(temp +" ");
            a+=h;
        }
    }
}
