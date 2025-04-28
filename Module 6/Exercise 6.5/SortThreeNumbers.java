import java.util.Scanner;

public class SortThreeNumbers {

    // Method to display numbers in sorted order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for three numbers
        System.out.print("Enter three numbers and press enter between each one: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        // Call method to display sorted numbers
        displaySortedNumbers(num1, num2, num3);
    }
}
