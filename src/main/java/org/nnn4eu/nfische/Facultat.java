package org.nnn4eu.nfische;

public class Facultat {
    public static int calculate(int num) {
        int result=1;
        if(num<=0)return 1;
        for(int i=1; i<=num;i++){
            System.out.println("i: "+i);
            result=result*i;
        }
        return result;
    }

    public static int calculate2(int num) {
        int result=1;
        if(num<=0)return 1;
        while(num>0){
            System.out.println("num: "+num);
            result=result*(num--);
        }
        return result;
    }
}
