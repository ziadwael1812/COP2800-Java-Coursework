import java.util.Scanner;

public class AverageArray {

    // Method to calculate average for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double avg = average(numbers);
        System.out.println("The average is: " + avg);
    }
}
