import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //integer_1
        /*System.out.print("Enter L sm :");
        int sm = sc.nextInt();
        int m=sm/100;
        System.out.print(sm+" sm = "+m+" m");*/
        //integer_2
        /*System.out.print("Enter M kg :");
        int m = sc.nextInt();
        int t=m/1000;
        System.out.println(m+" kg = "+t+" t");*/
        //integer_3
        /*System.out.print("Enter A bytes :");
        int b = sc.nextInt();
        int K=b/1024;
        System.out.println(b+" bytes = "+K+" K");*/
        //integer_4
        /*System.out.print("Enter A number: ");
        int a= sc.nextInt();
        System.out.print("Enter B number: ");
        int b= sc.nextInt();
        int c=a/b;
        System.out.println(c);
*/
        //integer_5
        /*System.out.print("Enter A number: ");
        int a= sc.nextInt();
        System.out.print("Enter B number: ");
        int b= sc.nextInt();
        int c=a%b;
        System.out.println(c);*/
        //integer_6
        /* System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int tens_digit = a / 10;
            int ones_digit = a % 10;
            System.out.println("tens_digit ->" + tens_digit);
            System.out.println("ones_digit ->" + ones_digit);
        } else {
            System.out.println("invalid input");
        }*/
        //integer_7
        /* System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int b = a / 10;
            int c = a % 10;
            int d = b + c;
            int e = b * c;
            System.out.println("Sum" + "(" + a + ")=" + d);
            System.out.println("product" + "(" + a + ")=" + e);
        } else {
            System.out.println("invalid input");
        }*/
        //integer_8
        /*System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int b = a / 10;
            int c = a % 10;
            System.out.println("Exchange of its digits :" + c + b);
        } else {
            System.out.println("Invalid digit");
        }
*/
        //integer_9
        /* System.out.print("Enter a three-digits :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            System.out.println("a hundreds digit->"+b);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_10
        /*System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a%10;
            int c=a%100 ;
            int d=c/10;
            System.out.println("a ones digit->"+b);
            System.out.println("a tens digit->"+d);*/
        //integer_11
        /*System.out.print("Enrer a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("Sum("+a+")="+(b+c+d));
            System.out.println("product("+a+")="+b*c*d);
    }   else {
            System.out.println("Error");
        }*/
        //integer_12
        /*System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("reading it from rigt to left->"+d+c+b);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_13
        /*System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("reading it from rigt to left->"+c+d+b);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_14
        /*System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("reading it from rigt to left->"+d+b+c);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_15
        /* System.out.print("Enter a three-digit :");
        int d = sc.nextInt();
        if(d>99 && d<1000){
            int a=d/100;
            int b=(d%100)/10;
            int c=d%10;
            System.out.println("will be changed->"+b+a+c);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_16
        /*System.out.print("Enter a three-digit :");
        int d = sc.nextInt();
        if(d>99 && d<1000){
            int a=d/100;
            int b=(d%100)/10;
            int c=d%10;
            System.out.println("will be changed->"+a+c+b);
        } else {
            System.out.println("invalid digit");
        }*/
        //integer_17
        /* System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>999){
           int  m=(n%1000)/100;
           System.out.println("a hundeds->"+m);
        } else {
            System.out.println("Error");
        }*/
        //integer_18
        /*System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>999){
            int  m=(n%10000)/1000;
            System.out.println("a thousands->"+m);
        } else {
            System.out.println("Error");
        }*/
        //integer_19
        /*System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n/60;
        System.out.println(n+" seconds = "+m+" minutes");*/
        //integer_20
        /*System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n/3600;
        System.out.println(n+" seconds = "+m+" hours ");*/
        //integer_21
        /*System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n%60;
        System.out.println(m+" seconds ");*/
        //integer_22
        /*System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n%3600;
        System.out.println(m+" seconds ");*/
        //integer_23
        /*System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=(n%3600)/60;
        System.out.println(m+" minutes ");*/
        //integer_24
        /*System.out.print("Enter K:");
        int k = sc.nextInt();
        int week=(1+(k-1))%7;
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
        }*/
        //integer_25
        /*System.out.print("Enter K:");
        int k = sc.nextInt();
        int week=(4+(k-1))%7;
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
        }*/
        //integer_26
        /*System.out.print("Enter K:");
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
        }*/
        //integer_27
        /*System.out.print("Enter K:");
        int k = sc.nextInt();
        int week=(6+(k-1))%7;
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
        }*/
        //integer_28
        /*System.out.print("Enter K:");
        int k = sc.nextInt();
        System.out.print("Enter N:");
        int n = sc.nextInt();
        int week=(n+(k-1))%7;
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
        }*/
        //integer_29
        /*System.out.print("Enter A number: ");
        int a = sc.nextInt();
        System.out.print("Enter B number: ");
        int b = sc.nextInt();
        System.out.print("Enter C number: ");
        int c = sc.nextInt();
        int placed=(a/c)* (b/c);
        int part=a*b-placed*c*c;
        System.out.println("squares placed on the rectangle->"+placed);
        System.out.println("part of rectangle->"+part);*/
        //integer_30
        /*System.out.println("Enter a year :");
        int year = sc.nextInt();
        int century = (year / 100)+1;
        System.out.println(year + " is a " + century + "th century");*/

    }
}
