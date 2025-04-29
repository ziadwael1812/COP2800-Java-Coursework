import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Fan userFan = new Fan();

        // Ask user to set up their fan
        System.out.println("Customize your fan!");

        System.out.print("Enter fan speed (1 = SLOW, 2 = MEDIUM, 3 = FAST): ");
        int speed = input.nextInt();
        userFan.setSpeed(speed);

        System.out.print("Enter fan radius (e.g., 5.0): ");
        double radius = input.nextDouble();
        userFan.setRadius(radius);

        input.nextLine(); // clear the buffer
        System.out.print("Enter fan color: ");
        String color = input.nextLine();
        userFan.setColor(color);

        System.out.print("Is the fan on? (true/false): ");
        boolean isOn = input.nextBoolean();
        userFan.setOn(isOn);

        // Show the final fan settings
        System.out.println("\nHere is your customized fan:");
        System.out.println(userFan.toString());

        input.close();
    }
}
