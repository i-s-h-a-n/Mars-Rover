package com.bootcamp;

public class FizzBuzz {
    public String run(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
