package Integers;
import java.util.Scanner;
public class Integer26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K:");
        int k = sc.nextInt();
        int week=(2+(k-1))%7;
        if (week==0){
            System.out.println(week+"->Sunday");
        } else if (week==1){
            System.out.println(week+"->Monday");
        } else if (week==2){
            System.out.println(week+"->Tuesday");
        } else if (week==3){
            System.out.println(week+"->Wednesday");
        } else if (week==4){
            System.out.println(week+"->Thursday");
        } else if (week==5){
            System.out.println(week+"->Friday");
        } else if (week==6){
            System.out.println(week+"->Saturday");
        }
    }
}
