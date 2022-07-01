package com.CWH_PS1;

import java.util.Scanner;

public class CWH_PS1_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometers : ");
        float km = sc.nextFloat();
        float mi = km/1.609f;
        System.out.println("The miles for the given kilometers is : " + mi);
    }
}
