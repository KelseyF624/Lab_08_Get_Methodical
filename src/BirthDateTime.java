import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        String minuteString = "";
        birthYear = SafeInput.getRangedInt(input, "Enter your birth year.");
        birthMonth = SafeInput.getRangedInt (input, "Enter your birth month.");
        switch (birthMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:}
        birthDay = SafeInput.getRangedInt (input, "Enter your birth day.(1-31)");
        switch (birthDay){
            case 4:
            case 6:
            case 9:
            case 11: }
        birthDay = SafeInput.getRangedInt (input, "Enter your birth day.(1-30)");
        switch (birthDay){
            case 2:
                if (birthYear % 4 == 0 && birthYear % 100 != 0);{
                    birthDay = SafeInput.getRangedInt (input, "Please enter your birth day. (1-29)");}
                else (birthYear % 100 == 0);{
                birthDay = SafeInput.getRangedInt (input, "Please enter your birth day. (1-28)");}
            break;}
        birthHour =  SafeInput.getRangedInt (input, "Please enter the hour you were born. (1-24)");
        birthMinute =  SafeInput.getRangedInt (input, "Please enter the minute you were born. (0-59)");
        System.out.printf("You were born at %d/%2d/%d." , birthYear , birthMonth , birthDay, birthHour , birthMinute);





    }
}


