package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1 :");
        int r1 = sc.nextInt();
        System.out.print("Enter r2 (r1>r2):");
        int r2 = sc.nextInt();
        double s1=Math.PI*Math.pow(r1,2);
        double s2=Math.PI*Math.pow(r2,2);
        double s3=s1-s2;
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("s3 = "+s3);
    }
}
