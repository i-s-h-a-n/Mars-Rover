package com.pathashala;

public class FizzBuzz {
    public String run(int number) {
        if(number % 5 == 0) {
            return "Buzz";
        }
        return "Fizz";
    }
}
