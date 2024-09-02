import AvarageTimeBetweenPeaksCalculator.AvarageTimeBetweenPeaksCalculator;
import RandomNumberGenerator.RandomNumberGenerator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = RandomNumberGenerator.generateRandomNumbers(100, 0, 100);
        AvarageTimeBetweenPeaksCalculator calculator = new AvarageTimeBetweenPeaksCalculator(numbers);

        System.out.println(calculator);
    }
}
