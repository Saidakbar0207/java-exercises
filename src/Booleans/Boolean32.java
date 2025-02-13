package Booleans;
import java.util.Scanner;
public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        System.out.print((c==Math.sqrt(Math.pow(a,2)+Math.pow(b,2)) || b==Math.sqrt(Math.pow(a,2)+Math.pow(c,2))|| a==Math.sqrt(Math.pow(c,2)+Math.pow(b,2)))? "True" : "False");
    }
}
