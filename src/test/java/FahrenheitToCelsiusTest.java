import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FahrenheitToCelsiusTest {
    @Test
    public void testConversion() {
        double fahrenheit = 45;
        double expectedCelsius = 7.222222222222222;
        double actualCelsius = (fahrenheit - 32) * 5 / 9;
        assertEquals(expectedCelsius, actualCelsius, 0.001);
    }
    @Test
    public void testConversion2(){
        assertEquals(7.22, FahrenheitToCelsius.ConvertToCelcius(), 0.01);
    }
}

