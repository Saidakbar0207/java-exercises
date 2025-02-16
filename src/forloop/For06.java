package forloop;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of 1 kg of sweets :");
        double num = sc.nextDouble();
        for (int i =2; i <= 10; i+=2) {
            double weight=i/10.0+1 ;
            System.out.println("The price of " + weight + " kg of sweets is " +(weight*num));
        }
    }
}
