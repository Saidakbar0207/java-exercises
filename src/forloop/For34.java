package forloop;

import java.util.Scanner;

public class For34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        double a1=1;
        double a2=2;
        double  temp;
        for(int i=1;i<=n;i++){
            System.out.print(a1 +" ");
            temp=(a1+2*a2)/3.0;
            a1=a2;
            a2=temp;

        }
    }
}
