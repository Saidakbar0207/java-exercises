package Conditionals;
import java.util.Scanner;
public class If6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("Larger number is : "+a);
        } else {
            System.out.println("Larger number is : "+b);
        }
    }
}
