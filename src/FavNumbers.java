import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int favNumber = 0;
        double favDecimal = 0;
        favNumber = SafeInput.getInt(input, "Enter your favorite number: ");
        favDecimal = SafeInput.getDouble(input, "Enter your favorite decimal.");
        System.out.println("Your favorite number is " + favNumber);
        System.out.println("Your favorite decimal number is " + favDecimal);
    }
}

