package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a threeDigits :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            System.out.println("a hundreds digit->"+b);
        } else {
            System.out.println("invalid digit");
        }
    }
}
