package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void fizzbuzz() {
       assertEquals("1",FizzBuzz.de(1));
    }
    @Test
    void fizzbuzz1() {
        assertEquals("Fizz",FizzBuzz.de(3));
    }
}






