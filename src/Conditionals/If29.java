package Conditionals;
import java.util.Scanner;
public class If29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>0 && a%2==0){
            System.out.println("positive even number");
        } else if(a>0 && a%2!=0){
            System.out.println("positive odd number");
        } else if(a==0){
            System.out.println("zero number");
        } else if(a<0 && a%2!=0){
            System.out.println("negative odd number");
        } else if(a<0 && a%2==0){
            System.out.println("negative even number");
        }
    }
}
