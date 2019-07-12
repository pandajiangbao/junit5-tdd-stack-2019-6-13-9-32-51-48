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
        String convert = fizzBuzz.convert(1);
        //Then
        Assertions.assertEquals("1",convert);
    }

}
