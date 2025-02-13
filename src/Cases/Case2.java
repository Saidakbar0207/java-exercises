package Cases;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        switch(n) {
            case 1 ->System.out.println("bad");
            case 2 ->System.out.println("unsatisfactory");
            case 3 ->System.out.println("mediocre");
            case 4 ->System.out.println("good");
            case 5 ->System.out.println("excellent");
            default -> System.out.println("error");
        }
    }
}
