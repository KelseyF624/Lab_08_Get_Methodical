import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celciusTemp = 0;
        double fahrenheitTemp = 0;
        int celciusStart = 0;
        int celciusEnd = 0;
        double rangeCelcius = 0;
        celciusStart = SafeInput.getInt(input, "Enter celcius temperature.");
        celciusEnd = SafeInput.getInt(input, "Enter the celcius temperature you would like to end at.");
        rangeCelcius = celciusEnd - celciusStart;
        celciusTemp = celciusStart;
        System.out.println("Celcius \t\tFahrenheit");
        for (int i = 1; i <= rangeCelcius +1; i++) {
            fahrenheitTemp = celciusTemp * 1.8 + 32;
            celciusTemp ++;
            System.out.printf ("%7.2f \t\t%6.2f\n", fahrenheitTemp, celciusTemp);
        };
    }
}
