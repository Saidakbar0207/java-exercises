package begins;

import java.util.Scanner;

public class Begin04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter d:");
      double d = sc.nextDouble();
      double pi=Math.PI;
      double length=pi*d;
      System.out.println("length = "+length);
    }
}

