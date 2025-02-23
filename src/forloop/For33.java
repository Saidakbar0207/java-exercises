package forloop;

import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int f1=0;
        int f2=1;
        int temp=0;
        for(int i=1;i<=n;i++){
            System.out.print(f1+" ");
            temp=f1+f2;
            f1=f2;
            f2=temp;
        }
    }
}
