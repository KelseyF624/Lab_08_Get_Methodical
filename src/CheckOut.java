import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean moreItems = true;
        do {
            itemPrice = SafeInput.getRangedInt(input, "Enter the item price.", .50,10.00);
            totalPrice += itemPrice;
            moreItems = SafeInput.getYNConfirm (input, "Do you have anymore items? (y/n)");
        }while (moreItems);
        System.out.print("The total price is $ %.2f.", totalPrice);
    }
}
