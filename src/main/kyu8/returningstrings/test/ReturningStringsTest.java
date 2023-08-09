package kyu8.returningstrings.test;

import kyu8.returningstrings.ReturningStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

public class ReturningStringsTest {
    @Test
    public void testSomething() {
        Assertions.assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }
}
