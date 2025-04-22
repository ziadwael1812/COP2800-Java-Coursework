import java.util.Scanner;

public class GratuityCalculator {
    public static double calculateGratuity(double subtotal, double rate) {
        return subtotal * (rate / 100);
    }

    public static double calculateTotal(double subtotal, double rate) {
        return subtotal + calculateGratuity(subtotal, rate);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate without % sign: ");
        double rate = input.nextDouble();

        double gratuity = calculateGratuity(subtotal, rate);
        double total = calculateTotal(subtotal, rate);

        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
    }
}
