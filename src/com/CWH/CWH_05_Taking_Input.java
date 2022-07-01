package com.CWH;
import java.util.Scanner;

public class CWH_05_Taking_Input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
//        int b = sc.nextInt();
        boolean b1 = sc.hasNextInt();
        if(!b1) {
            System.out.println("Please enter a valid input");
        }
//        System.out.println("The sum of the two numbers is : ");
    }
}
