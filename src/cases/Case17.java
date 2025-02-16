package cases;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (10<=n<=40):");
        int n = sc.nextInt();
        int a=n/10;
        int b=n%10;
        switch(a) {
            case 1 -> {
                switch (b) {
                    case 0 -> System.out.println("the tenth  task");
                    case 1 -> System.out.println("the eleventh task");
                    case 2 -> System.out.println("the twelfth task");
                    case 3 -> System.out.println("the thirteenth task");
                    case 4 -> System.out.println("the fourthteenth task");
                    case 5 -> System.out.println("the fifteenth task");
                    case 6 -> System.out.println("the sixthteenth task");
                    case 7 -> System.out.println("the seventhteenth task");
                    case 8 -> System.out.println("the eighthteenth task");
                    case 9 -> System.out.println("the ninthteenth task");
                    default -> System.out.println("invalid task");
                }
            }

            case 2 -> {
                switch (b) {
                    case 0 -> System.out.println("the twentieth task");
                    case 1 -> System.out.println("the twenty-first task");
                    case 2 -> System.out.println("the twenty-second task");
                    case 3 -> System.out.println("the twenty-third task");
                    case 4 -> System.out.println("the twenty-fourth task");
                    case 5 -> System.out.println("the twenty-fifth task");
                    case 6 -> System.out.println("the twenty-sixth task");
                    case 7 -> System.out.println("the twenty-seventh task");
                    case 8 -> System.out.println("the twenty-eightht task");
                    case 9 -> System.out.println("the twenty-ninth task");
                    default -> System.out.println("invalid task");
                }
            }
            case 3 -> {
                switch (b) {
                    case 0 -> System.out.println("the thirtieth task");
                    case 1 -> System.out.println("the thirty-first task");
                    case 2 -> System.out.println("the thirty-second task");
                    case 3 -> System.out.println("the thirty-third task");
                    case 4 -> System.out.println("the thirty-fourth task");
                    case 5 -> System.out.println("the thirty-fifth task");
                    case 6 -> System.out.println("the thirty-sixth task");
                    case 7 -> System.out.println("the thirty-seventh task");
                    case 8 -> System.out.println("the thirty-eightht task");
                    case 9 -> System.out.println("the thirty-ninth task");
                    default -> System.out.println("invalid task");
                }
            }
            case 4 -> {
                switch (b) {
                    case 0 -> System.out.println("the fortieth task");
                    default -> System.out.println("invalid task");
                }
            }
            default -> System.out.println("invalid task");
        }
    }
}
