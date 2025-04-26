public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        
        // Calculate tuition in ten years
        for (int year = 1; year <= 10; year++) {
            tuition *= 1.05;
        }
        
        double tuitionAfterTenYears = tuition;
        double totalCost = 0;
        
        // Calculate the total cost of four years' tuition after the tenth year
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition *= 1.05;
        }
        
        System.out.printf("Tuition after 10 years: $%.2f\n", tuitionAfterTenYears);
        System.out.printf("Total cost for four years after the tenth year: $%.2f\n", totalCost);
    }
}
