package functions;

import java.util.Scanner;

public class Func06 {
    public static void SumRange(int a, int b,int c,int sum,int sum1) {
        if(b>a) {
            for(int i=a;i<=b;i++){
                if(i<=c){
                    sum+=i;
                } else {
                    sum1+=i;
                }

            }
        } else {
            sum=0;
            sum1=0;
        }
        System.out.println("Sum :" + sum);
        System.out.println("Sum1 :" + (sum1+c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        int sum=0;
        int sum1=0;
        SumRange(a,b,c,sum,sum1);
    }
}
