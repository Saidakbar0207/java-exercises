package whiles;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        while(a>=b){
            a-=b;
        }
        System.out.println("Unused length:"+a);
    }
}
