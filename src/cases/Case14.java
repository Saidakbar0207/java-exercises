package cases;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (1-side a," +
                "2-radius r1 of inscribed,"+
                "3-radius r2 of circumscribed circle," +
                "4-area):");
        int order = sc.nextInt();
        System.out.print("Enter value :");
        double value = sc.nextDouble();
        double a=0,r1=0,r2=0,s=0;
        switch(order){
            case 1->{
                a=value;
                r1=a*Math.sqrt(3)/6;
                r2=2*r1;
                s=a*a*Math.sqrt(3)/4;
                break;
            }
            case 2->{
                r1=value;
                r2=2*r1;
                a=r1*6/(Math.sqrt(3));
                s=a*a*Math.sqrt(3)/4;
                break;
            }
            case 3->{
                r2=value;
                r1=r2/2;
                a=r1*6/(Math.sqrt(3));
                s=a*a*Math.sqrt(3)/4;
                 break;
            }
            case 4->{
                s=value;
                a=Math.sqrt(s*4/(Math.sqrt(3)));
                r1=a*Math.sqrt(3)/6;
                r2=2*r1;
                break;
            }
            default->{
                System.out.println("Invalid order");
                return;
            }
        }
        System.out.println("side a = "+a);
        System.out.println("radius r1 = "+r1);
        System.out.println("radius r2 = "+r2);
        System.out.println("area = "+s);
    }
}
