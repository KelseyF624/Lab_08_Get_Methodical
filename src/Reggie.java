import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String SSN = "";
        String mNumber = "";
        String menuChoice = "";
        SSN = SafeInput.getRegExString(input, "Enter your SSN: ^\\\\d{3}-\\\\d{2}-\\\\d{4}$");
        System.out.println("SSN: " + SSN);
        mNumber = SafeInput.getRegExString(input, "Enter your mNumber: ^(M|m)\\\\d{5}$");
        System.out.println("mNumber: " + mNumber);
        menuChoice = SafeInput.getRegExString(input, "Enter your menu choice: ^[OoSsVvQq]$");
        System.out.println("menuChoice: " + menuChoice);
    }
}
