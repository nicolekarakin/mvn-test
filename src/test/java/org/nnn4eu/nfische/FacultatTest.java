package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultatTest {
    @Test
    void testFacultat1(){
        //given
        int num=1;
        //when
        int actual=Facultat.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFacultat0(){
        //given
        int num=0;
        //when
        int actual=Facultat.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFacultat_1(){
        //given
        int num=-1;
        //when
        int actual=Facultat.calculate(num);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFacultat3(){
        //given
        int num=3;
        //when
        int actual=Facultat.calculate(num);
        //then
        int expected = 2*3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFacultat5(){
        //given
        int num=5;
        //when
        int actual=Facultat.calculate(num);
        //then
        int expected = 2*3*4*5;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testFacultat3_2(){
        //given
        int num=3;
        //when
        int actual=Facultat.calculate2(num);
        //then
        int expected = 2*3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFacultat5_2(){
        //given
        int num=5;
        //when
        int actual=Facultat.calculate2(num);
        //then
        int expected = 2*3*4*5;
        Assertions.assertEquals(expected, actual);
    }
}
