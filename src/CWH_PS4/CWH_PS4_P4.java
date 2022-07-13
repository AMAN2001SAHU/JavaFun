package CWH_PS4;

import java.util.Scanner;

public class CWH_PS4_P4 {
    public static void main(String[] args) {
        //WAP to find out the day of the week when the number of day is given
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


    }
}
