package Conditionals;
import java.util.Scanner;
public class If11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a==b){
            System.out.println("a = "+0);
            System.out.println("b = "+0);
        } else {
            if(a>b) {
                System.out.println("a= " + a);
                System.out.println("b= " + a);
            } else {
                System.out.println("a= " + b);
                System.out.println("b= " + b);
            }
        }
    }
}
