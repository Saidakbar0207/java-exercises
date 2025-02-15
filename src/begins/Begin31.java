package begins;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter T :");
        int t = sc.nextInt();
        double t_c=(t-32)*5/9;
        System.out.println("T_c = "+t_c);
    }
}
