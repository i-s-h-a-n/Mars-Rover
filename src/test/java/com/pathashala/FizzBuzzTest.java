package com.pathashala;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    @DisplayName("Number 3 is Fizz")
    void shouldBeFizzIfNumber3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.run(3));
    }

    @Test
    void shouldBeBuzzIfNumber5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.run(5));
    }

    @Test
    void shouldBeBuzzIfNumber10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.run(10));
    }
}
