package Rock_Paper_Scissors_Game;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int uScore = 0,cScore = 0;

        //This is the computer generated number
        int n = random.nextInt(3);
//        System.out.println(n);

        //This is the user generated number

        int i = 0;
        while (i<=5){


        System.out.println("Press : 0 for Rock \nPress : 1 for Paper \nPress : 2 for Scissor");
        int un = sc.nextInt();

        //for computer the same distribution is there of the
        //numbers with the Rock, Paper and Scissor
        if (n == un) {
            System.out.println("Same \nNo points awarded");
        }
        else if ((n == 0 && un == 1) || (n == 1 && un == 2) || (n == 2 && un == 0)) {
            System.out.println("User WIN \nThe User gets awarded 1 point");
            ++uScore;
        }
        else if ((n == 1 && un == 0) || (n == 2 && un == 1) || (n == 0 && un == 2)) {
            System.out.println("User LOST \nThe Computer gets awarded 1 point");
            ++cScore;
        }
        System.out.println("The Score is : " + uScore + "(User Score)" + "\t" + cScore + "(Computer Score)");
        }
    }
}
