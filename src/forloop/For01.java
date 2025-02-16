package forloop;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int k = sc.nextInt();
        System.out.print("Enter amount :");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
             System.out.print(k+" ");
        }
    }
}
