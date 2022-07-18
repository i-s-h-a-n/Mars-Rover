package com.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldBe_1_When_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.run(1));
    }

    @Test
    void shouldBe_2_When_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.run(2));
    }

    @Test
    void shouldBeFizzWhen_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz",3);
    }

    @Test
    void setup() {
        assertEquals("1", "1");
    }
}
