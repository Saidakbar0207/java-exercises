package forloop;

import java.util.Scanner;

public class For22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int x = sc.nextInt();
        System.out.print("Enter power of number :");
        int n = sc.nextInt();
        double sum=1;
        double temp=1.0;
        int y;
        y=x;
       for (int i = 1; i <= n; i++) {
           temp*=i;
           sum+=x/temp;
           x*=y;
       }
       System.out.println("Sum = "+sum);
    }
}
