package cases;

import java.util.Scanner;

public class Case09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day :");
        int day = sc.nextInt();
        System.out.print("Enter month :");
        int month = sc.nextInt();
        switch (month) {
            case 1,3,5,7,8,10->{
                switch (day) {
                    case 31->{
                        month ++;
                        day=1;
                    }default -> {
                        day++;
                    }
                }
            }
            case 2->{
                switch (day) {
                    case 28->{
                        month ++;
                        day=1;
                    } default -> {
                        day++;
                    }
                }
            }

            case 4,6,9,11-> {
                switch (day) {
                    case 30 -> {
                        month++;
                        day = 1;
                    }
                    default -> {
                        day++;
                    }
                }
            }
            case 12->{
                switch (day) {
                    case 31->{
                        month =1;
                        day = 1;
                    } default -> {
                        day++;
                    }
                }
            }
        }
        System.out.println("Previous date: " + day + " " + month);
    }
}