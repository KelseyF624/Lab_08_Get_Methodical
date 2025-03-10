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