package conditionals;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x= sc.nextInt();
        if(x<=0){
            System.out.println(" -x->"+(-x));
        } else if(0>x && x<2){
            System.out.println("f(x)=x*x->"+(x*x));
        } else {
            System.out.print(4);
        }
    }
}
