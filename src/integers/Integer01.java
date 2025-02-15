package integers;

import java.util.Scanner;

public class Integer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L sm :");
        int sm = sc.nextInt();
        int m=sm/100;
        System.out.print(sm+" sm = "+m+" m");
    }
}
