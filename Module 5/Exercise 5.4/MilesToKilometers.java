public class MilesToKilometers {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-10d%-10.3f\n", miles, kilometers);
        }
    }
}