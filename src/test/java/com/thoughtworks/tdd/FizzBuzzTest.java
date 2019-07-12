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
    @Test
    public void return_Fizz_when_input_3(){
        //Given
        int num=3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Fizz",convert);
    }
    @Test
    public void return_Buzz_when_input_5(){
        //Given
        int num=5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Buzz",convert);
    }
    @Test
    public void return_Fizz_when_input_6(){
        //Given
        int num=6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Fizz",convert);
    }
    @Test
    public void return_Whizz_when_input_7(){
        //Given
        int num=7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Whizz",convert);
    }
    @Test
    public void return_Buzz_when_input_10(){
        //Given
        int num=10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Buzz",convert);
    }
    @Test
    public void return_Whizz_when_input_14(){
        //Given
        int num=14;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("Whizz",convert);
    }
    @Test
    public void return_FizzBuzz_when_input_15(){
        //Given
        int num=15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(num);
        //Then
        Assertions.assertEquals("FizzBuzz",convert);
    }
}
