package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int num){
        if (num%3==0) return "Fizz";
        if (num==5) return "Buzz";
        return String.valueOf(num);
    }
}
