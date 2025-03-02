package procs;

import java.util.Scanner;

public class Proc05 {
    public static void RectPs(int x1, int y1, int x2, int y2,int[] results ) {
        results[0] = 2*(Math.absExact(x2-x1)+Math.absExact(y2-y1));
        results[1] = (Math.absExact(x1-x2)*Math.absExact(y1-y2));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 :");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 :");
        int y2 = sc.nextInt();
        int[] results = new int[2];
        RectPs(x1,y1,x2,y2,results);
        System.out.println("Perimeter = " + results[0]);
        System.out.println("Area = " + results[1]);
    }
}
