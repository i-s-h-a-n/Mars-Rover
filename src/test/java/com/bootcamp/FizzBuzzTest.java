package com.bootcamp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldBeOneWhen_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.run(1));
    }

    @Test
    void shouldBeTwoWhen_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.run(2));
    }

    @Test
    void shouldBeFizzWhen_MultipleOf_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.run(3));
        assertEquals("Fizz", fizzBuzz.run(6));
    }

    @Test
    void shouldBeFizzWhen_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.run(6));
    }

    @Nested
    class MultipleOfFive {
        @Test
        void shouldBeBuzzWhen_5() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Buzz", fizzBuzz.run(5));
        }

        @Test
        void shouldBeBuzzWhen_10() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Buzz", fizzBuzz.run(10));
        }
    }

    @Test
    @DisplayName("Should be FizzBuzz when 15")
    void shouldBeFizzBuzzWhen_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.run(15));
    }

    @Test
    @DisplayName("Should be FizzBuzz when 30")
    void shouldBeFizzBuzzWhen_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.run(30));
    }
}
