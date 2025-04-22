import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height
        int totalInches = (feet * 12) + inches;
        double heightMeters = totalInches * 0.0254;

        // Convert weight
        double weightKg = weightPounds * 0.45359237;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Output BMI
        System.out.printf("BMI is %.15f\n", bmi);

        // Interpretation
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
