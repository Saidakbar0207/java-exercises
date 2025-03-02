package procs;

import java.util.Scanner;

public class Proc22 {
    public static int Calc(int a, int b, int Op) {
      switch(Op) {
          case 1:
              return (a - b);
          case 2:
              return (a * b);
          case 3:
              return (a / b);
          default:
              return (a + b);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter N1 (operation 1): ");
        int n1 = sc.nextInt();
        System.out.print("Enter N2 (operation 2): ");
        int n2 = sc.nextInt();
        System.out.print("Enter N3 (operation 3): ");
        int n3 = sc.nextInt();
        int result1 = Calc(a, b, n1);
        int result2 = Calc(a, b, n2);
        int result3 = Calc(a, b, n3);
        System.out.println("subtraction = "+result1);
        System.out.println("multiplication = "+result2);
        System.out.println("division = "+result3);


    }
}
