package Conditionals;
import java.util.Scanner;
public class If13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        if((number1 <number2 && number1 >number3) || number1 >number2 && number1 <number3){
            System.out.println("middle number is "+number1);
        } else if((number2 <number1 && number2 >number3) || number2 >number1 && number2 <number3){
            System.out.println("middle number is "+number2);
        } else if((number3 <number1 && number3 >number2)|| number3 >number1 && number3 <number2){
            System.out.println("middle number is "+number3);
        }
    }
}
