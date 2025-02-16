package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v :");
        int v = sc.nextInt();
        System.out.print("Enter u :");
        int u = sc.nextInt();
        System.out.print("Enter t1 :");
        int t1 = sc.nextInt();
        System.out.print("Enter t2 :");
        int t2 = sc.nextInt();
        int s=v*t1+u*t2;
        System.out.println("distance = "+s);
    }

}
