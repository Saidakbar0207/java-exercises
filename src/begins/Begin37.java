package begins;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v1 :");
        int v1 = sc.nextInt();
        System.out.print("Enter v2 :");
        int v2 = sc.nextInt();
        System.out.print("Enter t :");
        int t = sc.nextInt();
        int totalDistance=(Math.absExact(v1-v2))*t;
        System.out.println("TotalDistance  = "+totalDistance);
    }
}
