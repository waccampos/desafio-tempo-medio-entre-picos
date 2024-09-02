package AvarageTimeBetweenPeaksCalculator;

import Peak.Peak;

import java.util.ArrayList;
import java.util.List;

public class AvarageTimeBetweenPeaksCalculator {
    private final List<Integer> values;
    private final List<Peak> peaks;

    public AvarageTimeBetweenPeaksCalculator(List<Integer> values) {
        this.values = values;
        this.peaks = findPeaks(values);
    }

    private List<Peak> findPeaks(List<Integer> numbers) {
        List<Peak> peaks = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if ( i == 0 ) {
                if (numbers.get(i) > numbers.get(i + 1) && numbers.get(i) >= 50) {
                    peaks.add(new Peak(numbers.get(i), i));
                }
                continue;
            }

            if (i == numbers.size() - 1) {
                if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) >= 50) {
                    peaks.add(new Peak(numbers.get(i), i));
                }
                continue;
            }

            if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) > numbers.get(i + 1) && numbers.get(i) >= 50 ) {
                peaks.add(new Peak(numbers.get(i), i));
            }
        }

        return peaks;
    }

    public double calculateAverageTimeBetweenPeaks() {
        int totalTimeBetweenPeaks = 0;
        for (int i = 0; i < this.peaks.size() - 1; i++) {
            totalTimeBetweenPeaks += this.peaks.get(i + 1).time() - this.peaks.get(i).time();
        }
        return (double) totalTimeBetweenPeaks / (this.peaks.size() - 1);
    }

    public String formatTime(double totalSeconds) {
        int minutes = (int) totalSeconds / 60;
        int seconds = (int) totalSeconds % 60;

        return String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        return String.format("""
                Valores: %s
                Picos: %s
                Tempo médio entre picos: %s
                """, this.values, this.peaks, this.formatTime(calculateAverageTimeBetweenPeaks()));
    }
}
