package integers;

import java.util.Scanner;

public class Integer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a threeDigit :");
        int d = sc.nextInt();
        if(d>99 && d<1000){
            int a=d/100;
            int b=(d%100)/10;
            int c=d%10;
            System.out.println("will be changed->"+b+a+c);
        } else {
            System.out.println("invalid digit");
        }
    }
}
