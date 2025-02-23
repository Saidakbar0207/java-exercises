package forloop;

import java.util.Scanner;

public class For24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int x = sc.nextInt();
        System.out.print("Enter power of number :");
        int n = sc.nextInt();
        double sum=0;
        double temp;
        int fact=1;
        for(int i=0;i<=n;i++){
            int power=2*i;
            temp=Math.pow(-1,i)*Math.pow(x,power)/fact;
            sum+=temp;
            fact*=(power+1)*(power+2);
        }
        System.out.println("The sum of the numbers is : "+sum);
    }
}
