package Booleans;
import java.util.Scanner;
public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();
        System.out.print((x%2==1 && y%2==0)|| (x%2==0 && y%2==1) ? "True" : "False");
    }
}
