package whiles;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int sum=0;
        while(a>=b){
            a-=b;
            sum++;
        }
        System.out.println("The division is : "+sum);
        System.out.println("The remainder is : "+a);

    }
}
