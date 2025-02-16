package whiles;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=1;
        while(num>0){
            sum*=num;
            num-=2;
        }
        System.out.println("The product of the double factorial is "+sum);
    }
}
