package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name month :");
        String month = sc.nextLine();
        switch (month) {
            case "January" -> System.out.println("31");
            case "February" -> System.out.println("28");
            case "March" -> System.out.println("29");
            case "April" -> System.out.println("30");
            case "May" -> System.out.println("31");
            case "June" -> System.out.println("31");
            case "July" -> System.out.println("31");
            case "August" -> System.out.println("31");
            case "September" -> System.out.println("31");
            case "October" -> System.out.println("31");
            case "November" -> System.out.println("31");
            case "December" -> System.out.println("31");
            default -> System.out.println("Invalid month");
        }
    }
}
