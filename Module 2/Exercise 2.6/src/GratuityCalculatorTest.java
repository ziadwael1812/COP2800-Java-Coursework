import static org.junit.Assert.*;
import org.junit.Test;

public class GratuityCalculatorTest {

    @Test
    public void testCase1() {
        assertEquals(5.0, GratuityCalculator.calculateGratuity(50.0, 10), 0.001);
        assertEquals(55.0, GratuityCalculator.calculateTotal(50.0, 10), 0.001);
    }

    @Test
    public void testCase2() {
        assertEquals(20.0, GratuityCalculator.calculateGratuity(100.0, 20), 0.001);
        assertEquals(120.0, GratuityCalculator.calculateTotal(100.0, 20), 0.001);
    }

    @Test
    public void testCase3() {
        assertEquals(3.75, GratuityCalculator.calculateGratuity(25.0, 15), 0.001);
        assertEquals(28.75, GratuityCalculator.calculateTotal(25.0, 15), 0.001);
    }

    @Test
    public void testCase4() {
        assertEquals(10.0, GratuityCalculator.calculateGratuity(80.0, 12.5), 0.001);
        assertEquals(90.0, GratuityCalculator.calculateTotal(80.0, 12.5), 0.001);
    }
}
