package org.nnn4eu.nfische;

public class Alarm {
    public static int getMaxAmount(String alarm) {
        int amount=0;
        switch(alarm){
            case "yellow":
                amount=30;
                break;
            case "green":
                amount=60;
                break;
            default:
                amount=0;//"red"
                break;
        }
        return amount;
    }
}
