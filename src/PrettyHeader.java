import java.util.Scanner;
public class PrettyHeader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = SafeInput.getNonZeroLenString(input, "Enter a message to display.");
        prettyHeader(message);}
    public static void prettyHeader(String message) {
        int spaces = 54 - message.length();
        int space1 = spaces / 2;
        int space2 = space1;
        if (spaces %2 == 1)
            space2++;
        for (int s = 1; s <= spaces; s++) {
            System.out.print("*");}
        for (int sp = 1; sp <= spaces; sp++) {
            System.out.print(" ");}
        for (int s = 1; s <= 3; s++) {
            System.out.print("*");}
        for (int s = 1; s <= 60; s++) {
            System.out.print("*");}
    }
}
