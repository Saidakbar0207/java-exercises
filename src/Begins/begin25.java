package Begins;

import java.util.Scanner;

public class begin25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        int y= (int)(3*Math.pow(x,6)-6*Math.pow(x,2)-7);
        System.out.println("y = "+y);
    }
}
