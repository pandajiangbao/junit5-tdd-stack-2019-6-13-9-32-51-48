package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int num){
        String string="";
        if (num%3==0) {
            string+="Fizz";
        }
        if (num%5==0) {
            string+="Buzz";
        }
        if (num%7==0) {
            string+="Whizz";
        };
        if(!(num%3==0||num%5==0||num%7==0)) return String.valueOf(num);
        return string;
    }
}
