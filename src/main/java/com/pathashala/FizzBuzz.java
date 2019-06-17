package com.pathashala;

public class FizzBuzz {
    public String run(int number) {
        if(isMultipleOf5(number)) {
            return "Buzz";
        }
        return "Fizz";
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
