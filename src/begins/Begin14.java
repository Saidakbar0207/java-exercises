package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R :");
        double r = sc.nextDouble();
        double l=2*Math.PI*r;
        double s=Math.PI*r*r;
        System.out.println("L = "+l);
        System.out.println("S = "+s);
    }
}
