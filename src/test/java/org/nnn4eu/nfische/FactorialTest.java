package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    void testFactorial1(){
        //given
        int num=1;
        //when
        int actual=Factorial.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFactorial0(){
        //given
        int num=0;
        //when
        int actual=Factorial.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFactorial_1(){
        //given
        int num=-1;
        //when
        int actual=Factorial.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFactorial3(){
        //given
        int num=3;
        //when
        int actual=Factorial.calculate(num);
        //then
        int expected = 2*3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFactorial5(){
        //given
        int num=5;
        //when
        int actual=Factorial.calculate(num);
        //then
        int expected = 2*3*4*5;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testFactorial3_2(){
        //given
        int num=3;
        //when
        int actual=Factorial.calculate2(num);
        //then
        int expected = 2*3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFactorial5_2(){
        //given
        int num=5;
        //when
        int actual=Factorial.calculate2(num);
        //then
        int expected = 2*3*4*5;
        Assertions.assertEquals(expected, actual);
    }
}
