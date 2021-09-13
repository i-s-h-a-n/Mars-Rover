package com.bootcamp;

public class FizzBuzz {
    public String run(int number) {
        if(isMultipleOfThree(number)) {
            return "Fizz";
        }
        if(isMultipleOfFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
