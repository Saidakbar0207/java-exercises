package forloop;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of 1 kg of sweets :");
        double num = sc.nextDouble();
        for (int i =1; i <= 10; i++) {
            double weight=i/10.0 ;
            System.out.println("The price of " + weight + " kg of sweets is " +(weight*num));
        }
    }
}
