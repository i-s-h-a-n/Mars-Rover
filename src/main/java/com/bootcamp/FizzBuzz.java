package com.bootcamp;

public class FizzBuzz {
    public String run(int number) {
        if(isMultipleOfThree(number)) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
