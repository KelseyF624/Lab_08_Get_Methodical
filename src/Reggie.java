import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String mNumber = "";
        String menuChoice = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + SSN);
        mNumber = SafeInput.getRegExString(in, "Enter your mNumber","^(M|m)\\d{5}$");
        System.out.println("mNumber: " + mNumber);
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice","^[OoSsVvQq]$");
        System.out.println("menuChoice: " + menuChoice);
    }
}
