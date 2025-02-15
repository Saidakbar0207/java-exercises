package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R :");
      double r = sc.nextDouble();
      double L=2*Math.PI*r;
      double S=Math.PI*r*r;
      System.out.println("L = "+L);
      System.out.println("S = "+S);

    }
}
