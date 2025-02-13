package Conditionals;
import java.util.Scanner;
public class If22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        if (x>0 && y>0) {
            System.out.println("1 quarter");
        } else if(x<0 && y>0 ){
            System.out.println("2 quarter");
        } else if(x<0 && y<0){
            System.out.println("3 quarter");
        } else if(x>0 && y<0){
            System.out.println("4 quarter");
        }
    }

}
