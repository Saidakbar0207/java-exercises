package Conditionals;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x= sc.nextInt();
        if(x<-2 || x>2){
            System.out.println("f(x)=2*x->"+(2*x));
        } else {
            System.out.println("f(x)=-3*x->"+(-3*x));
        }
    }
}
