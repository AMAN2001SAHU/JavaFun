package CWH_PS4;

//WAP to find out whether the student is pass or fail if it requires total 40% to pass
//and 33% in each subject
//take user input for the marks and assume 3 subjects

import java.util.Scanner;

public class CWH_PS4_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        float sum = 0;
        float totalPercent;

        //now taking the total marks in one subject
        System.out.print("Enter the total marks in a subject : ");
        float totalMarksSub = sc.nextFloat();

        //now calculating the total marks in all three subjects
        float totalSum = totalMarksSub*3;

        //now taking the marks obtained in each 3 subjects
        System.out.println("Enter the marks of the sub 1 : ");
        a = sc.nextInt();
        System.out.println("Enter the marks of the sub 2 : ");
        b = sc.nextInt();
        System.out.println("Enter the marks of the sub 3 : ");
        c = sc.nextInt();

        //now calculating total percentage
        float totalSubSum = a+b+c;
        totalPercent = (totalSubSum/totalSum) *100.0f;

        //now calculating individual subject percentage
        float aPercent = (a/totalMarksSub) *100.0f;
        float bPercent = (b/totalMarksSub) *100.0f;
        float cPercent = (c/totalMarksSub) *100.0f;

        //now applying the conditions according to the question
        if(totalPercent >=40.0 && aPercent >=33.0 && bPercent >=33.0 && cPercent >=33.0)
            System.out.println("The student is pass");
        else System.out.println("The student is fail");
    }
}
