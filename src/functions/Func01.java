package functions;

import java.util.Scanner;

public class Func01 {
    public static int Sign(int x){
        if(x<0) return -1;
        if(x==0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x = sc.nextInt();
        System.out.println(Sign(x));

    }
}
