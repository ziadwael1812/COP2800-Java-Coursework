import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double convertToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = convertToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        scanner.close();
    }
}