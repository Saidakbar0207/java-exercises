package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               System.out.print("Enter a:");
      int a = sc.nextInt();
      System.out.print("Enter b:");
      int b = sc.nextInt();
      double average = (a+b)/2.0;
      System.out.println("average = " + average);
    }

}
