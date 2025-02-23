package forloop;

import java.util.Scanner;

public class For35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int a1=1;
        int a2=2;
        int a3=3;
        int  temp;
        for(int i=1;i<=n;i++){
            System.out.print(a1 +" ");
            temp=(a3+a2-2*a1);
            a1=a2;
            a2=a3;
            a3=temp;

        }
    }
}
