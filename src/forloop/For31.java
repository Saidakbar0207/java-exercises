package forloop;

import java.util.Scanner;

public class For31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int a0=2;
        double b;
        for(int i=1;i<=n;i++){
            b=1.0/i;
            double temp=a0+b;
            System.out.println("a"+i+"="+temp);
        }
    }
}
