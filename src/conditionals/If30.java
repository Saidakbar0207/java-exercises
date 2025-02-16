package conditionals;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a>=1 && a<10 && a%2==0){
            System.out.println("onesDigits even number");
        } else if(a>=1 && a<10 && a%2!=0){
            System.out.println("onesDigits odd number");
        } else if(a>=10 && a<100 && a%2!=0){
            System.out.println("twosDigits odd number");
        } else if(a>=10 && a<100 && a%2==0){
            System.out.println("twosDigits even number");
        } else if(a>=100 && a<1000 && a%2==0) {
            System.out.println("threeDigits even number");
        }  else if(a>=100 && a<1000 && a%2!=0){
            System.out.println("threeDigits odd number");
        }
    }
}
