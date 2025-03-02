package procs;

import java.util.Scanner;

public class Proc16 {
    public static int Sign(int n){
        if(n<0) return -1;
        else if(n==0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number :");
        int n = sc.nextInt();
        System.out.println(Sign(n));

    }
}
