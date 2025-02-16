package cases;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter suit(1<=m<=4):");
        int m = sc.nextInt();
        System.out.print("Enter card value(6<=n<=14):");
        int n = sc.nextInt();
        switch (m) {
            case 1 -> {
                switch (n) {
                    case 6 -> System.out.println("six of spades");
                    case 7 -> System.out.println("seven of spades");
                    case 8 -> System.out.println("eight of spades");
                    case 9 -> System.out.println("nine of spades");
                    case 10 -> System.out.println("ten of spades");
                    case 11 -> System.out.println("jack of spades");
                    case 12 -> System.out.println("queen of spades");
                    case 13 -> System.out.println("king of spades");
                    case 14 -> System.out.println("ace of spades");
                    default -> {
                        System.out.println("invalid number");
                        return;
                    }
                }
            }
            case 2 -> {
                switch (n) {
                    case 6 -> System.out.println("six of clubs");
                    case 7 -> System.out.println("seven of clubs");
                    case 8 -> System.out.println("eight of clubs");
                    case 9 -> System.out.println("nine of clubs");
                    case 10 -> System.out.println("ten of clubs");
                    case 11 -> System.out.println("jack of clubs");
                    case 12 -> System.out.println("queen of clubs");
                    case 13 -> System.out.println("king of clubs");
                    case 14 -> System.out.println("ace of clubs");
                    default -> {
                        System.out.println("invalid number");
                        return;
                    }
                }
            }
            case 3 -> {
                switch (n) {
                    case 6 -> System.out.println("six of diamonds");
                    case 7 -> System.out.println("seven of diamonds");
                    case 8 -> System.out.println("eight of diamonds");
                    case 9 -> System.out.println("night of diamonds");
                    case 10 -> System.out.println("ten of diamonds");
                    case 11 -> System.out.println("jack of diamonds");
                    case 12 -> System.out.println("queen of diamonds");
                    case 13 -> System.out.println("king of diamonds");
                    case 14 -> System.out.println("ace of diamonds");
                    default -> {
                        System.out.println("invalid number");
                        return;
                    }
                }
            }
            case 4 -> {
                switch (n) {
                    case 6 -> System.out.println("six of hearts");
                    case 7 -> System.out.println("seven of hearts");
                    case 8 -> System.out.println("eight of hearts");
                    case 9 -> System.out.println("night of hearts");
                    case 10 -> System.out.println("ten of hearts");
                    case 11 -> System.out.println("jack of hearts");
                    case 12 -> System.out.println("queen of hearts");
                    case 13 -> System.out.println("king of hearts");
                    case 14 -> System.out.println("ace of hearts");
                    default -> {
                        System.out.println("invalid number");
                        return;
                    }
                }
            }
        }
    }
}
