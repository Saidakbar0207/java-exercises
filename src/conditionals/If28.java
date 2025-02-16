package conditionals;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of years: ");
        int x = sc.nextInt();
        if(x%100==0 && x%400==0){
            System.out.println("this is years have 366");
        } else {
            System.out.println("this is years have 365");
        }
    }
}
