import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        int itemCount = 0;
        boolean done = false;
        do {
            itemPrice = SafeInput.getRangedDouble(input,"Enter the item price.",.5,10);
            totalPrice += itemPrice;
            itemCount++;
            done = SafeInput.getYNConfirm(input, "Are you done? (y/n)");
        }while (!done);
        System.out.printf("The total of these " + itemCount + " items is " + totalPrice);
    }
}
