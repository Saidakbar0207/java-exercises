package begins;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 :");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 :");
        int y2 = sc.nextInt();
        double distance =Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("the distance  = "+distance);
    }
}
