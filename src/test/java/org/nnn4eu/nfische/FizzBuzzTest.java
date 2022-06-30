package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 7,11, 13})
    void number1(int num) {
        // given num

        // when
        String actual = FizzBuzz.transform(num);

        // then
        String expected = ""+num;
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8, 10, 14})
    void number2(int num) {
        // given num

        // when
        String actual = FizzBuzz.transform(num);

        // then
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {6, 12, 24 ,30, 42})
    void number3(int num) {
        // given num

        // when
        String actual = FizzBuzz.transform(num);

        // then
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, actual);
    }
}
