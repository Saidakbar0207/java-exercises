package begins;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
      int a = sc.nextInt();
      System.out.print("Enter b:");
      int b = sc.nextInt();
      double geometricMean=Math.sqrt(a*b);
      System.out.println("geometricMean = "+geometricMean);

    }
}
