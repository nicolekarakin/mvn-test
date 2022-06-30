package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RoomCalculatorTest {
    @Test
    void numberGreaterThan30(){
        //given
        int limit =30;
        int num=30;
        //when
        String actual=RoomCalculator.greaterThan(num,limit);
        //then
        String expected="nope";
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 15}) // six numbers
    void numberGreaterThan30_shouldOk(int num) {
        //given
        int limit =30;

        //when
        String actual=RoomCalculator.greaterThan(num,limit);
        //then
        String expected="ok";
        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -3, 30,35, Integer.MAX_VALUE}) // six numbers
    void numberGreaterThan30_shouldNope(int num) {
        //given
        int limit =30;

        //when
        String actual=RoomCalculator.greaterThan(num,limit);
        //then
        String expected="nope";
        Assertions.assertEquals(expected,actual);
    }
}
