package Cases;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name of months :");
        String months = sc.next();
        switch (months) {
            case "January,Febrauary,December" -> System.out.println("Winter");
            case "Febrauary" -> System.out.println("Winter");
            case "March" -> System.out.println("Spring");
            case "April" -> System.out.println("Spring");
            case "May" -> System.out.println("Spring");
            case "June" -> System.out.println("Summer");
            case "July" -> System.out.println("Summer");
            case "August" -> System.out.println("Summer");
            case "September" -> System.out.println("Autumn");
            case "October" -> System.out.println("Autumn");
            case "November" -> System.out.println("Autumn");
            case "December" -> System.out.println("Winter");
        }
    }
}
