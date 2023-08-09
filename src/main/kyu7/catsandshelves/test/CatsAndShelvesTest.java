package kyu7.catsandshelves.test;

import kyu7.catsandshelves.CatsAndShelves;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatsAndShelvesTest {
    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(2, CatsAndShelves.solution(1, 5));
    }
}