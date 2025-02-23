package forloop;

import java.util.Scanner;

public class For32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int a0=1;
        double b;
        double temp=a0;
        for(int i=1;i<=n;i++){
            temp=(temp+1)/i;
            System.out.println("a"+i+"="+temp);
        }
    }
}
