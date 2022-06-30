package org.nnn4eu.nfische;

public class AlarmCalculator {

    public static String greaterThan(int num, int i) {
        return (num>=i || num<0)?"nope":"ok";
    }

    public static String getAlarmStatus(int num, String level){

        int amount=Alarm.getMaxAmount(level);
        String state=greaterThan(num, amount);

        return state;
    }

}
