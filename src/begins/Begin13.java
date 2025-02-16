package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R_1 :");
        int r1 = sc.nextInt();
        System.out.print("Enter R_2 (R_1>R_2):");
        int r2 = sc.nextInt();
        double s_1=Math.PI*Math.pow(r1,2);
        double s_2=Math.PI*Math.pow(r2,2);
        double s_3=s_1-s_2;
        System.out.println("S_1 = "+s_1);
        System.out.println("S_2 = "+s_2);
        System.out.println("S_3 = "+s_3);
    }
}
