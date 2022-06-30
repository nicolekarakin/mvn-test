package org.nnn4eu.nfische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlarmTest {

    @Test
    void redAlarm(){
        //given
        String alarm="red";
        //when
        int actual=Alarm.getMaxAmount(alarm);
        //then
        int expected=0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void yellowAlarm(){
        //given
        String alarm="yellow";
        //when
        int actual=Alarm.getMaxAmount(alarm);
        //then
        int expected=30;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void greenAlarm(){
        //given
        String alarm="green";
        //when
        int actual=Alarm.getMaxAmount(alarm);
        //then
        int expected=60;
        Assertions.assertEquals(expected,actual);
    }

}
