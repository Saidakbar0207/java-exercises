package Begins;
import java.util.Scanner;
public class begin26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        int y= (int) (4*Math.pow(x-3,6)-7*Math.pow(x-3,3)+2);
        System.out.println("y = "+y);
    }
}
