package kyu7.catsandshelves;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatsAndShelvesTest {
    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(2, CatsAndShelves.solution(1, 5));
    }
}