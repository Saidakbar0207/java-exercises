package conditionals;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter b number :");
        int b = sc.nextInt();
        System.out.print("Enter c number :");
        int c = sc.nextInt();
        int sum=0;
        int sum1=0;
        if(a>0) {
            sum++;
        } else {
            sum1++;
        }
        if(b>0){
            sum++;
        } else {
            sum1++;
        }if(c>0){
            sum++;
        } else {
            sum1++;
        }
        System.out.println("Sum is positive : "+sum);
        System.out.println("Sum is negative : "+sum1);
    }
}
