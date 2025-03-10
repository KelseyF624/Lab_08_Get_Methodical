import java.util.Scanner;
public class DevTest {
    public static String getNonZeroLenString (Scanner pipe, String prompt) {
    String retString = "";
    do {
    System.out.print("\n" + prompt + ": ");
    retString = pipe.nextLine();
}while (retString.equals(""));
return retString;
}
}
public static int getInt (Scanner pipe, String prompt) {
    boolean validInt = true;
    int retInt = 0;
    do {
        System.out.print("\n" + prompt + ": ");
        if (pipe.hasNextInt()) {
            retInt = pipe.nextInt();
            validInt = true;
        } else {
            pipe.nextLine();
            validInt = false;
        }
    }while (validInt);
    pipe.nextLine();
    return retInt;

    public static double getdouble (Scanner pipe, String prompt) {
        boolean validDouble = false;
        double retDouble = 0;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                validDouble = true;
            } else {
                pipe.nextLine();
                System.out.print("Your input is not a double.");
            }
        }while (validDouble);
        pipe.nextLine();
        return retDouble;}
    public static int getRangedInt (Scanner pipe, String prompt) {
        boolean inRange = false;
        int retInt = 0;
        do {
            retInt = getInt(pipe, prompt);
            if retInt >= low && retInt <= high) {
                inRange = true;}
            else {System.out.println("Your input is not a range.");}
        }while (!inRange);
        pipe.nextLine();
        return retInt;}
    public static String getYNConfirm (Scanner pipe, String prompt) {
        boolean validString = false;
        String retString = "";
        do {
            retString = DevTest.getNonZeroLenString (pipe, prompt);
            validString = true;}
    else {
            System.out.println("Your input is not a string.");}
        while (!validString);
        pipe.nextLine();
        return retString;

    }
