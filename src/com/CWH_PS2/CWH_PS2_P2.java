package com.CWH_PS2;

public class CWH_PS2_P2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
