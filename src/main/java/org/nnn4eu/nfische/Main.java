package org.nnn4eu.nfische;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Hello world!!");
        int[] ab=JavaDummy.input(2);
        System.out.println(JavaDummy.summ( ab[0], ab[1]));
        System.out.println(JavaDummy.printSumm( ab[0], ab[1]));
        System.out.println(JavaDummy.greaterThanX(ab[0],100));
    }

    public static String transform(int num){
        String result = num+"";
        if (num%5 == 0 || num%3 == 0)result="Fizz";
        if (num%3 == 0) result=result+"Bazz";
        return result;
    }
}
