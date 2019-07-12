package com.thoughtworks.tdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void return_1_when_input_1(){
        //Given
        int num=1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("1",convert);
    }
    @Test
    public void return_2_when_input_2(){
        //Given
        int num=2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("2",convert);
    }
}
