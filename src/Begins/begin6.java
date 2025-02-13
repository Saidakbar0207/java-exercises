package Begins;
import java.util.Scanner;
public class begin6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        int V=a*b*c;
        System.out.println("V="+V);
        int S=2*(a*b+a*c+b*c);
        System.out.println("S="+S);
    }
}
