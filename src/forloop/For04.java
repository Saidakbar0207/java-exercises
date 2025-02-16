package forloop;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price 1 kg of sweets :");
        Double num = sc.nextDouble();
        for (int i = 1; i <=10; i++) {
            System.out.println("The price of "+i+" kg of sweets is "+(num*i));
        }
    }
}
