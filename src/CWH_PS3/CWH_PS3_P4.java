package CWH_PS3;

public class CWH_PS3_P4 {
    public static void main(String[] args) {
        String intro = "Hello my name is   Aman Sahu";
        int doubleSpace = intro.indexOf("  ");
        int tripleSpace = intro.indexOf("   ");
        if (doubleSpace == -1) System.out.println("The String does not have double spaces");
        else System.out.println("The string has double spaces");
        if (tripleSpace == -1) System.out.println("The String does not have triple spaces ");
        else System.out.println("The string has triple spaces");
    }
}
