package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r :");
        double r = sc.nextDouble();
        double l=2*Math.PI*r;
        double s=Math.PI*r*r;
        System.out.println("l = "+l);
        System.out.println("s = "+s);
    }
}
