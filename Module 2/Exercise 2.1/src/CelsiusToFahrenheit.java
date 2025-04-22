20
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double convertToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {

            System.out.print("Enter a degree in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = convertToFahrenheit(celsius);

            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");


            System.out.print("Would you like to convert another temperature? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Please dont ask me again. Thank you!");
        scanner.close();
    }
}
