public class SumDigits {
    
    // Method to compute sum of digits
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    // Test program
    public static void main(String[] args) {
        System.out.println("Sum of digits in 234 is: " + sumDigits(234)); // Expected output: 9
        System.out.println("Sum of digits in 1001 is: " + sumDigits(1001)); // Expected output: 2
        System.out.println("Sum of digits in 98765 is: " + sumDigits(98765)); // Expected output: 35
    }
}
