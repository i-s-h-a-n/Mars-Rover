package com.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldBeOneWhenNumberOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.run(1));
    }

    @Test
    void shouldBeTwoWhenNumberTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.run(2));
    }

    @Test
    void shouldBeFizzWhenNumberThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.run(3));
    }

    @Test
    void shouldBeFizzWhenNumberSix() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.run(6));
    }

    @Test
    void shouldBeBuzzWhenNumberFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.run(5));
    }

    @Test
    void shouldBeBuzzWhenNumberTen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.run(10));
    }

}
