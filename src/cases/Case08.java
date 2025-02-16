package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number :");
        int d= sc.nextInt();
        System.out.print("Enter a month number :");
        int m = sc.nextInt();
        if (d == 1) {
            switch (m) {
                case 1:
                    d = 31; m = 12;
                    break;
                case 2:
                    d = 31; m = 1;
                    break;
                case 3:
                    d = 28; m = 2;
                    break;
                case 4:
                    d = 31; m = 3;
                    break;
                case 5:
                    d = 30; m = 4;
                    break;
                case 6:
                    d = 31; m = 5;
                    break;
                case 7:
                    d = 30; m = 6;
                    break;
                case 8:
                    d = 31; m = 7;
                    break;
                case 9:
                    d = 31; m = 8;
                    break;
                case 10:
                    d = 30; m = 9;
                    break;
                case 11:
                    d = 31; m = 10;
                    break;
                case 12:
                    d = 30; m = 11;
                    break;
                default:
                    System.out.println("Invalid month!");
                    return;
            }
        } else {
            d--;
        }
        System.out.println("Previous date: " + d + " " + m);
    }
}
