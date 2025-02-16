package whiles;

import java.util.Scanner;

public class while04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        while(n>0){
            n-=3;
        } if(n!=0){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
