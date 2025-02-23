package forloop;

import java.util.Scanner;

public class For26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (|x|<1):");
        double x = sc.nextDouble();
        System.out.print("Enter power of number (n>0):");
        int n = sc.nextInt();
        double sum=0;
        double temp;
        for(int i=0;i<=n;i++){
            int power=2*i+1;
            temp=Math.pow(-1,i)*Math.pow(x,power)/power;
            sum+=temp;
        }
        System.out.println("The sum of the numbers is: "+sum);
    }
}
