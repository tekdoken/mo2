package bai9.fizz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void find3() {
        int number=3;
        String expec="Fizz";
        String re=FizzBuzz.findF(number);
        assertEquals(expec,re);
    }   @Test
    void find5() {
        int number=5;
        String expec="Buzz";
        String re=FizzBuzz.findF(number);
        assertEquals(expec,re);
    }
    @Test
    void find35() {
        int number=15;
        String expec="FizzBuzz";
        String re=FizzBuzz.findF(number);
        assertEquals(expec,re);
    }
}