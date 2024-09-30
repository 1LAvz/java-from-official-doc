package lavz.example01;

/**
 * there are unit tests for this class.
 */

public class Calculator {

    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = getSum(numbers);

        double avg = (double) sum / numbers.length;
        double rounded = Math.round(avg * 100.0) / 100.0;
        return rounded;
    }

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}