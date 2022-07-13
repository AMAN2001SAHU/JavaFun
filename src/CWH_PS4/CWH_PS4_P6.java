package CWH_PS4;

import java.util.Scanner;

public class CWH_PS4_P6 {
    public static void main(String[] args) {
        //WAP to find the type of website using the url of it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url of the website : ");
        String url = sc.nextLine();
        if(url.endsWith(".com")) {
            System.out.println("It is a commercial website");
        }
        else if (url.endsWith(".in")) {
            System.out.println("It is a indian website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("It is a organisational website");
        }
        else System.out.println("Enter the right url");


    }
}
