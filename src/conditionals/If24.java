package conditionals;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x>0){
            System.out.println("f(x)="+(2*Math.sin(x)));
        } else {
            System.out.println("(6-x)="+(6-x));
        }

    }
}
