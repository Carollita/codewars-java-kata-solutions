package kyu8.evenorodd.test;

import kyu8.evenorodd.EvenOrOdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {
    @Test
    public void solution() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }
}