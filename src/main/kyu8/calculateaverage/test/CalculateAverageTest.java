package kyu8.calculateaverage.test;

import kyu8.calculateaverage.CalculateAverage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateAverageTest {
    private static final double DELTA = 1e-15;
    @Test
    public void solution() {
        assertEquals(1, CalculateAverage.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, CalculateAverage.find_average(new int[]{1, 2, 3}), DELTA);
    }
}