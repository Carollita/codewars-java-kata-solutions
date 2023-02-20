package kyu8.returningstrings;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
    public class ReturningStringsTest {
        @Test
        public void solution() {
            assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
        }
    }