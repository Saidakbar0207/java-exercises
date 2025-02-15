package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number :");
        int D= sc.nextInt();
        System.out.print("Enter a month number :");
        int M = sc.nextInt();
        if (D == 1) {
            switch (M) {
                case 1:
                    D = 31; M = 12;
                    break;
                case 2:
                    D = 31; M = 1;
                    break;
                case 3:
                    D = 28; M = 2;
                    break;
                case 4:
                    D = 31; M = 3;
                    break;
                case 5:
                    D = 30; M = 4;
                    break;
                case 6:
                    D = 31; M = 5;
                    break;
                case 7:
                    D = 30; M = 6;
                    break;
                case 8:
                    D = 31; M = 7;
                    break;
                case 9:
                    D = 31; M = 8;
                    break;
                case 10:
                    D = 30; M = 9;
                    break;
                case 11:
                    D = 31; M = 10;
                    break;
                case 12:
                    D = 30; M = 11;
                    break;
                default:
                    System.out.println("Invalid month!");
                    return;
            }
        } else {
            D--;
        }
        System.out.println("Previous date: " + D + " " + M);
    }
}
