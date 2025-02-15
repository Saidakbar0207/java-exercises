package begins;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x_1 :");
        int x_1 = sc.nextInt();
        System.out.print("Enter x_2 :");
        int x_2 = sc.nextInt();
        System.out.print("Enter y_1 :");
        int y_1 = sc.nextInt();
        System.out.print("Enter y_2 :");
        int y_2 = sc.nextInt();
        int perimetr=2*(Math.absExact(x_2-x_1)+Math.absExact(y_2-y_1));
        int area=Math.absExact(x_2-x_1)*Math.absExact(y_2-y_1);
        System.out.println("Perimetr = "+perimetr);
        System.out.println("Area = "+area);
    }
}
