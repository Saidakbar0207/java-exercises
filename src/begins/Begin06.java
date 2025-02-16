package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        int v=a*b*c;
        System.out.println("v="+v);
        int s=2*(a*b+a*c+b*c);
        System.out.println("s="+s);
    }
}
