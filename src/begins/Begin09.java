package begins;

import java.util.Scanner;

public class begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
      int a = sc.nextInt();
      System.out.print("Enter b:");
      int b = sc.nextInt();
      double geometric_mean=Math.sqrt(a*b);
      System.out.println("geometric mean = "+geometric_mean);

    }
}
