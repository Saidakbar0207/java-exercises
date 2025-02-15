package integers;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n/60;
        System.out.println(n+" seconds = "+m+" minutes");
    }
}
