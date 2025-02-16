package cases;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (1-leg a, 2-hypotenuse c,3-altitude h ,4-area s):");
        int n = sc.nextInt();
        System.out.print("Enter value :");
        Double value = sc.nextDouble();
        double a = 0, c = 0, h = 0, s = 0;
        switch (n) {
            case 1 -> {
                a = value;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            }
            case 2 -> {
                c = value;
                a = c / (Math.sqrt(2));
                h = c / 2;
                s = c * h / 2;
                break;
            }
            case 3 -> {
                h = value;
                c = h * 2;
                s = c * h / 2;
                a = c / (Math.sqrt(2));
                break;
            }
            case 4 -> {
                s = value;
                c = 2 * Math.sqrt(s);
                h = c / 2;
                a = c / (Math.sqrt(2));
                break;
            }
            default -> {
                System.out.println("invalid input");
                return;
            }
        }
        System.out.println("leg = "+a);
        System.out.println("hypotenuse = "+c);
        System.out.println("altitude = "+h);
        System.out.println("area = "+s);

    }
    }

