package forloop;

import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the power of a: ");
        int n=sc.nextInt();
        double temp=a;
        double sum=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                sum += a;
            } else {
                sum-=a;
            }
            a=a*temp;
        }
        System.out.println("The sum of the power of a is "+sum);
    }
}
