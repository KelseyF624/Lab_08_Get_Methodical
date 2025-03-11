import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highValue = 0;
        int lowValue = 0;
        int hour = 0;
        int minute = 0;
        int day = 0;
        int month = 0;
        int year = 0;
        year = SafeInput.getRangedInt (input, "Enter your birth year.", 1950, 2025);
        month = SafeInput.getRangedInt (input, "Enter your birth month.", 1, 12);
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            highValue = 31;
        break;
        case 2:
            highValue = 29;
        break;
        case 6:
        case 9:
        case 11:
        case 4:
            highValue = 30;
        break;}
        day = SafeInput.getRangedInt(input, "Enter your birth day.", 1, highValue);
        hour = SafeInput.getRangedInt(input, "Enter your birth hour.", 1, 24);
        minute = SafeInput.getRangedInt(input, "Enter your birth minute.", 0, 59);
        System.out.println ("Your date of birth is: " + month + " " + day + " " + year + " " + "You were born at " + hour + " " + minute + ".");
    }
}


