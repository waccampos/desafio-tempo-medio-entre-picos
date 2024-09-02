package RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static List<Integer> generateRandomNumbers(int quantity, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantity; i++) {
            int number = random.nextInt(max - min + 1) + min;
            numbers.add(number);
        }

        return numbers;
    }
}
