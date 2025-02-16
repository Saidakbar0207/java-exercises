package begins;

import java.util.Scanner;

public class Begin19 {
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
        int perimetr=2*(Math.absExact(x2-x1)+Math.absExact(y2-y1));
        int area=Math.absExact(x2-x1)*Math.absExact(y2-y1);
        System.out.println("perimetr = "+perimetr);
        System.out.println("area = "+area);
    }
}
