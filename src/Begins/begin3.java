package Begins;
import java.util.Scanner;
public class begin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a:");
      int a = sc.nextInt();
      System.out.print("Enter b:");
      int b = sc.nextInt();
      int S=a*b;
      int Perimetr=2*(a+b);
      System.out.println("Perimetr = "+Perimetr);
      System.out.println("S = "+S);

    }
}
