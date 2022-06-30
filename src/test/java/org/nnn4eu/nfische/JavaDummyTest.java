package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaDummyTest {

    @Test
    void greaterThanX() {
        //given
        int toCompare=20;
        int compareWith=100;

        //when
        boolean actual=JavaDummy.greaterThanX(toCompare, compareWith );
        //then
        boolean expected=false;
        Assertions.assertTrue(expected==actual);
    }

}
