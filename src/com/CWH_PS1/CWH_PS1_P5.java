package com.CWH_PS1;

import java.util.Scanner;

public class CWH_PS1_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value : ");
        boolean b1 = sc.hasNextInt();
        if(!b1) System.out.println("The value is not integer.");
        else System.out.println("The value is integer.");
//        System.out.println(b1);
    }
}
