package lavz;

import lavz.example01.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldCalculateAverageOfPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = 3.0;
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void shouldCalculateAverageOfNegativeNumbers() {
        int[] numbers = {-5, -15};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = -10;
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void shouldCalculateAverageOfMixedPositiveAndNegativeNumbers() {
        int[] numbers = {-5, 20};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = 7.5;
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void shouldCalculateAverageForPositiveNumbersWithPeriodic() {
        int[] numbers = {5, 10, 20};
        double calculatedAverage = Calculator.average(numbers);

        double expectedAverage = 11.67;
        assertEquals(expectedAverage, calculatedAverage);
    }

    @Test
    void shouldReturnZeroAverageForEmptyArray() {
        int[] numbers = {};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = 0;
        assertEquals(expectedAverage, actualAverage);
    }
}