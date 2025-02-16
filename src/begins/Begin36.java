package begins;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter V_1 :");
        int v1 = sc.nextInt();
        System.out.print("Enter V_2 :");
        int v2 = sc.nextInt();
        System.out.print("Enter T :");
        int t = sc.nextInt();
        int totalDistance=(v1+v2)*t;
        System.out.println("Total distance  = "+totalDistance);
    }
}
